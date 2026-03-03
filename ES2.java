import java.util.Scanner;
public class ES2 {
    public static void main (String[] args){
        String nom;
        int  age;
        float taille;
        Scanner cs=new Scanner(System.in);
        System.out.print(" Entrée vos nom: ");
        nom= cs.nextLine();
        System.out.print("Quel age avez vous ? : ");
        age= cs.nextInt();
        System.out.print("Quelle taille avez vous ?: ");
        taille= cs.nextFloat();
        System.out.print(" Je m'appelle "+nom+", j'ai "+age+" ans. Je mesure "+taille+" metres ");

    }
}
