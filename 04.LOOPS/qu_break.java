import java.util.*;
public class qu_break{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter num :");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);

        }
        System.out.println("end of code!");
    }
}