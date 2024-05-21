import java.util.*;
public class smallest {
    public static int small(int arr[]){
       // int smallest = Integer.MAX_VALUE;

        int smallest = arr[0];

        for(int i = 0 ; i<arr.length ; i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }


        }

        return smallest;
    }


    public static void main(String[] args){

        int arr[] = { 45 , 67, 54, 67, 567, 9, 2, 789};
        System.out.println("the smallest number is "+small(arr));
    }
}
