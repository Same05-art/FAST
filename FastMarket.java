import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println(id + " - " + name + " | " + price + " FCFA | Stock: " + stock);
    }
}

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.price * quantity;
    }
}

class Order {
    static int counter = 1;
    int orderNumber;
    List<CartItem> items;
    double total;
    String paymentMethod;
    String status;

    public Order(List<CartItem> items, String paymentMethod) {
        this.orderNumber = counter++;
        this.items = new ArrayList<>(items);
        this.paymentMethod = paymentMethod;
        this.status = "CONFIRMÉE";
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        double sum = 0;
        for (CartItem item : items) {
            sum += item.getTotal();
        }
        return sum;
    }

    public void display() {
        System.out.println("\nCommande N°" + orderNumber);
        for (CartItem item : items) {
            System.out.println(item.product.name + " x " + item.quantity + " = " + item.getTotal());
        }
        System.out.println("Total: " + total + " FCFA");
        System.out.println("Paiement: " + paymentMethod);
        System.out.println("Statut: " + status);
    }
}

public class FastMarket {

    static List<Product> products = new ArrayList<>();
    static List<CartItem> cart = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static User currentUser;

    public static void main(String[] args) {

        initProducts();
        login();

        int choice;

        do {
            System.out.println("\n=== FAST MARKET BENIN ===");
            System.out.println("1. Voir produits");
            System.out.println("2. Ajouter au panier");
            System.out.println("3. Voir panier");
            System.out.println("4. Valider commande");
            System.out.println("5. Historique commandes");
            System.out.println("0. Quitter");
            System.out.print("Choix: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showProducts();
                case 2 -> addToCart();
                case 3 -> showCart();
                case 4 -> checkout();
                case 5 -> showOrders();
            }

        } while (choice != 0);

        System.out.println("Au revoir " + currentUser.name + " !");
    }

    static void initProducts() {
        products.add(new Product(1, "Casque Bluetooth", 15000, 10));
        products.add(new Product(2, "Montre Connectée", 25000, 5));
        products.add(new Product(3, "Crème Cosmétique", 5000, 20));
    }

    static void login() {
        scanner.nextLine();
        System.out.println("=== Connexion ===");
        System.out.print("Nom: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        currentUser = new User(name, email);
        System.out.println("Bienvenue " + name + " !");
    }

    static void showProducts() {
        System.out.println("\n--- Produits disponibles ---");
        for (Product p : products) {
            p.display();
        }
    }

    static void addToCart() {
        System.out.print("ID produit: ");
        int id = scanner.nextInt();

        for (Product p : products) {
            if (p.id == id) {
                System.out.print("Quantité: ");
                int qty = scanner.nextInt();

                if (qty > 0 && qty <= p.stock) {
                    cart.add(new CartItem(p, qty));
                    p.stock -= qty;
                    System.out.println("Ajouté au panier !");
                } else {
                    System.out.println("Quantité invalide.");
                }
                return;
            }
        }
        System.out.println("Produit non trouvé.");
    }

    static void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Panier vide.");
            return;
        }

        double total = 0;
        System.out.println("\n--- Panier ---");

        for (CartItem item : cart) {
            System.out.println(item.product.name + " x " + item.quantity + " = " + item.getTotal());
            total += item.getTotal();
        }

        System.out.println("TOTAL: " + total + " FCFA");
    }

    static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Panier vide !");
            return;
        }

        showCart();

        scanner.nextLine();
        System.out.println("\nMode de paiement:");
        System.out.println("1. Livraison");
        System.out.println("2. MTN MoMo");
        System.out.println("3. Moov Money");
        System.out.print("Choix: ");
        int payment = scanner.nextInt();

        String paymentMethod;

        switch (payment) {
            case 1 -> paymentMethod = "Paiement à la livraison";
            case 2 -> paymentMethod = "MTN MoMo";
            case 3 -> paymentMethod = "Moov Money";
            default -> {
                System.out.println("Mode invalide.");
                return;
            }
        }

        Order order = new Order(cart, paymentMethod);
        orders.add(order);
        order.display();

        cart.clear();
    }

    static void showOrders() {
        if (orders.isEmpty()) {
            System.out.println("Aucune commande.");
            return;
        }

        for (Order o : orders) {
            o.display();
        }
    }
}