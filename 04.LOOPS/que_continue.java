import java.util.*;
public class que_continue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter num:");
            int num = sc.nextInt();
            if(num %10==0){
                continue;
            };
            System.out.println(num);

        }
    }
}
