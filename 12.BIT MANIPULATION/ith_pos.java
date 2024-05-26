public class ith_pos {
    public static int ithPos(int n , int i){

        if((n & (1<<i))==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        System.out.println(ithPos(10, 3));
    }
    
}
