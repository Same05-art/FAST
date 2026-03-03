import java.util.Scanner;
public class ES5 {
    public static void main(String[] args){
        Scanner cs= new Scanner(System.in);
        Integer age;
        System.out.print("Entrer votre age:" );
        age=cs.nextInt();
        if (age>=18){
            System.out.print(" Vous êtes majeur ");
        }
        else {System.out.print(" Vous êtes mineur ");}
    }
    
}
