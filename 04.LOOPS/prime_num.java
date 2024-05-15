import java.util.*;
public class prime_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int isPrime = 1;
       for(int i = 2 ; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime+=1 ;
            }
        }
        if(n == 2){
            System.out.println("It is prime");
        }
        else if(isPrime == 1){
            System.out.println("It is prime");
        }
        else{
            System.out.println("it is not prime.");
        }
      
    }
}
