import java.util.Scanner;

public class Factoriel {

public static void main(String[] args) {
    Scanner cs= new Scanner(System.in);
    System.out.print("Vous voulez le factoriel de quel nombre: ");
    int n = cs.nextInt();
   
    if (n!=0) {
        int fact=1;
    for(int i=1; i<=n;i++){
        fact=fact*i;
    }
    System.out.println(n+"! = "+ fact);
    } 
    else{System.out.println(n+"! = "+ 1);}
}
    
}
