public class half_inv_num {
    public static void half_inv(int n){
        for(int i = 1; i<=n; i++ ){
            //int k = 1;
            for (int j = 1; j<=n-i+1;j++){
            System.out.print(j+" ");
               // k++;
             }

             System.out.println();
        }
    }

    public static void main(String[] args){
        half_inv(5);
    }
}
