public class TilingProblem {
    public static int Tile(int n){
        if(n==0||n==1){
            return 1;
        }
        //tile(n-1) for vertical tiles filling 
        //tile(n-2) for horizontal tiles filling 
        return Tile(n-1)+Tile(n-2);
    }

    public static void main(String[] args){
        System.out.println(Tile(4));
    }
    
}
