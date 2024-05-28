public class SortArray {
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args){
        int arr[] = {2,5,6,7,1};
        System.out.println(isSorted(arr, 0));
    }
    
}
