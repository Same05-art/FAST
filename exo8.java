import java.util.Scanner;
public class exo8 { 
public static void main(String[] args){
    System.out.println("Calculatrice de deux nombres");
    Scanner cs = new Scanner(System.in);

    System.out.println("Premier nombre: ");
    float a = cs.nextFloat();
     System.out.println("Deuxieme nombre: ");
    float b = cs.nextFloat();


    System.out.println("********Menu********");
    System.out.println("1- Addition");
    System.out.println("2- Soustraction");
    System.out.println("3- Division");

    int c;

    System.out.println(" Entrer le numéro de l'opération que vous souhaitez exercée: ");
    
    c=cs.nextInt();
    if(c==1){
        System.out.print(a+"+"+b+"="+ (a+b));
    }
    else if(c==2){
        System.out.print(a+"-"+b+"="+ (a-b));
    }
    else if(c==3){
        System.out.print(a+"/"+b+"="+ (a/b));
    }
    else {
        System.out.print("Vous n'avez pas respecter le faite qu'il s'agit des nombres");
    }

}
    
}
    
