import java.util.Scanner;
public class exo1{
    public static void main(String[] args){
        System.out.println("Vous devez entrer les deux nombres à comparer");
        Scanner cs= new Scanner(System.in);
       System.out.println("Le nombre a : ");
        int a =cs.nextInt();
        System.out.println("Le nombre b : ");
        int b =cs.nextInt();
        if (a<b) {
            System.out.println("Le nombre le plus petit est:  "+ a);
            
        }
        else if(a==b){System.out.println("Les deux nombres sont les mêmes");
            }
        else{System.out.println("Le nombre le plus petit est:  "+ b);
            }
    }
}