import java.util.Scanner;
public class ES6 {
    public static void main(String[] args){
        float n1, n2, n3, moy;
        Scanner cs = new Scanner(System.in);
        System.out.println("Vous voulez calculer la moyenne ");

        System.out.print("Note 1: ");

        n1=cs.nextFloat();

        System.out.print("Note 2: ");

        n2=cs.nextFloat();

    System.out.print("Note 3: ");

        n3=cs.nextFloat();
        moy=(n1+n2+n3)/3;
        if (moy>=10){
            System.out.print("Admis");
        }
        else{
            System.out.print("Ajourne");
        }
    }
}
