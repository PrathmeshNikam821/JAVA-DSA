import java.util.*;
public class calculator {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter num1:");
        int a = sc.nextInt();
        System.out.println("Enter num2:");
        int b = sc.nextInt();
        System.out.println("Enter operation:");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+': System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            default:System.out.println("Wrong operation!");
        }

    }
}
