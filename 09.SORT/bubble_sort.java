public class bubble_sort{
    public static void bubble(int arr[]){
        int swap =0;
        for (int i = 0; i< arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }

        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(swap);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        bubble(arr);
    }


}