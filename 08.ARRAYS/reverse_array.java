
public class reverse_array {

    public static void reverse(int arr[]){
        int first = 0 , last = arr.length -1;
        while(first<last){

            int swap = arr[first];
            arr[first] = arr[last];
            arr[last]=swap;

            last--;
            first++;
        }
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    
        System.out.println();
        
    }

    public static void main(String [] args){
        int arr[]={10 , 34 , 45 , 54 ,56 };
        reverse(arr);

    }
    
}
