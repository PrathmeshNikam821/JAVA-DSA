public class floyds_tri {
     
    public static void floyd_tria(int n){
        int k =1;
        for (int i =1; i<=n; i++){
            
            for(int j = 1; j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        floyd_tria(5);
    }
    
}
