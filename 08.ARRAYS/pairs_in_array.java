public class pairs_in_array {
    public static void PrintPair(int arr[]){
        int tp = 0;
        for(int i = 0; i<arr.length; i++){
           // int curr = arr[i];
            for(int j =i+1 ; j<arr.length; j++){
                System.out.print("  ("+arr[i]+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :"+tp);
    }


    public static void main(String[] args){
        int arr[] = {23 , 34,54 , 32 , 56 , 43};
        PrintPair(arr);
    }
}
