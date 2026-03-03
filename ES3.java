import java.util.Scanner;
public class ES3 {
    public static void main(String[] args){
        int a,b;
        Scanner cs= new Scanner(System.in);
        System.out.println(" Bienvenue sur notre appli, vous voulez sommer deux entiers ");
        System.out.print("Entrer le nombre a: ");
        a=cs.nextInt();
        System.out.print("Entrer le nombre a: ");
        b=cs.nextInt();
        int d= a+b;
        System.out.println("La somme des deux entiers est: " + d);
    }
    
}
