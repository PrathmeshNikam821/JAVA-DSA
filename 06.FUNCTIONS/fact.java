import java .util.*;
public class fact {
    public static void fact_num(long num){
        int f = 1;
        for(int i = 1;i<=num; i++ ){
            f*=i;
        }
        System.out.println("The factorial is :"+f);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        fact_num(num);
        fact_num(5);
    }
}
