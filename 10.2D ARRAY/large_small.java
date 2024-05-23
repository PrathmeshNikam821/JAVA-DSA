import java.util.*;
public class large_small {

    public static void large(int matrix[][]){
        int max = Integer.MIN_VALUE;
       

 for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("the max is "+max);
    }

    public static void small(int matrix[][]){
        int min = Integer.MAX_VALUE;
       

 for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("the small is "+min);
    }


    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
               matrix[i][j]=sc.nextInt();
            }
        }  
        large(matrix); 
        small(matrix);    


    }
    
}
