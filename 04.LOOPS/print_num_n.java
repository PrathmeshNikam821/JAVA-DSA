import java.util.*;
public class print_num_n {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter range  : ");
        int range = sc.nextInt();
        int counter = 1;

        while(counter<=range){
            System.out.println(counter);
            counter++;
        }
    }
}
