public class set_ith {
    public static int setBit(int n , int i){
        return n | (1<<i);
    }

    public static void main(String [] args){
        System.out.println(setBit(10, 2));
    }
    
}
