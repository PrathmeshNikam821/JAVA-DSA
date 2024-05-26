public class clear_i {
    public static int clearIbits(int n , int i ){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }


    public static void main(String[] args){
        System.out.println(clearIbits(15, 2));
    }
    
}
