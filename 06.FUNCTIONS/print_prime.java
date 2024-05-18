public class print_prime {

    public static boolean Prime(int n){
        if(n==2){
            return true;
        }

        for(int i =2 ; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    
    }

    public static void printPrime(int num){
        for(int i = 2 ; i<=num; i++){
            if(Prime(i)){
                System.out.print(i+" ");
            }
        }


    }
    

    public static void main(String[] args){
        printPrime(10000);
    }
}
