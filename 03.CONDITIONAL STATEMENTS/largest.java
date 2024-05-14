import java.util.*;
public class largest {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the num1: ");
         int a = sc.nextInt();
         System.out.println("Enter the num2: ");
         int b = sc.nextInt();

         if(a>=b){
            System.out.println(a+" is largesst number.");
         }
         else {
            System.out.println(b+" is the largest number ");
         }
    }
    
}
