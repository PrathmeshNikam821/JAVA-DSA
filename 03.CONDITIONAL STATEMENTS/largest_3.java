import java.util.*;
public class largest_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no ");
        int a = sc.nextInt();
        System.out.println("Enter th e second number: ");
        int b = sc.nextInt();
        System.out.println("Enter th e third number : ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" is  largest . ");

        }
        else if(b>=c){
            System.out.println(b+" is largest.");
        }

        else{
            System.out.println(c+" is largest.");
        }
    }
}