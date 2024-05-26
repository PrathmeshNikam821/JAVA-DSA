public class evenorodd {
    public static void EvenOdd(int n){
       // int bitMask = 1;
        if((n & 1)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    
    public static void main(String[] args){
        EvenOdd(34);
        EvenOdd(23);
    }
}
