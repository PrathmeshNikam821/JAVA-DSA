public class reverse {
    public static void main(String[] args){
        int n = 34566323;
        while(n>0){
            int last_digit = n%10;
            System.out.print(last_digit);
            n = n/10;
        }
    }
    
}
