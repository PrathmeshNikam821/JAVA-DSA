public class updateIth {
    public static int clearBit (int n , int i ){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }

    public static int Update(int n , int i , int newBit){
        n = clearBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static void main(String[] args){
        System.out.println(Update(10,2,1));
    }
    
}
