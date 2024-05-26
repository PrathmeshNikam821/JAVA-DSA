public class ClearIth {
    public static int clearI(int n , int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }


    public static void main(String[] args){
        System.out.println(clearI(10, 1));
    }
    
}
