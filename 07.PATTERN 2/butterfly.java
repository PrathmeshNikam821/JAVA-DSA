public class butterfly {
    public static void butterflyy(int n){
        for(int i =1; i<=n;i++){
            /*for(int j = i; j>=1; j--){
                System.out.print("*");
            }

            for(int j = 2*(n-i); j>=1;j--){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print("*");
            }*/
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }

            for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

            
        }

        for(int i=n;i>=1;i--){
            /*for(int j = i; j>=1; j--){
                System.out.print("*");
            }

            for(int j = 2*(n-i); j>=1;j--){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print("*");
            }*/

            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }

            for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String [] args){
        butterflyy(4);
    }
    
}
