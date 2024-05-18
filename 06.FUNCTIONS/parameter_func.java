import java.util.*;
public class parameter_func {
    public static int sum(int a , int b){
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println("The sum is : "+sum);
    }
}
