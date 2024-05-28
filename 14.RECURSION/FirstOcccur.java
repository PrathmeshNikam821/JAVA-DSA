public class FirstOcccur {
    public static int firstOcc(int arr[], int key , int i){

        if (arr[i]!=key && i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstOcc(arr, key, i+1);
    }

    public static void main(String[] args){
        int arr[] ={ 1, 4, 5 ,4 ,5, 7 ,8};
        System.out.println(firstOcc(arr, 9, 0));
    }
    
}
