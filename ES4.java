import java.util.Scanner;
public class ES4 {

    public static void main(String[] args){
        String nom;
        int age;
        Scanner cs=new Scanner(System.in);
        System.out.print("Entrer votre nom: ");
        nom= cs.nextLine();
        System.out.print("Quel age avez vous ? : ");
        age= cs.nextInt();

        System.out.print(" Bienvenue "+nom+", Vous avez "+age+" ans.");

    }

    
}
