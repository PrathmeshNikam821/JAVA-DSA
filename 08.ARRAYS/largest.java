import java.util.*;
public class largest {
    public static int large(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){

            if (largest<arr[i]){
                largest=arr[i];
            }
        }


        return largest;
    }


    public static void main(String[] args){
        int arr[]={ 1 , 5 ,8 ,20 , 45, 15 ,67, 54};
        System.out.println("The largest element is : "+large(arr));
    }

}
