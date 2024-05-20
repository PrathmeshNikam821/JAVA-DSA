public class inverted_rorate_half {
    public static void inverted_pyramid(int n){

        for(int i = 1; i<=n; i++){
            //for spaces
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            
            // for stars
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void main(String[] args){
        inverted_pyramid(4);
    }
}
