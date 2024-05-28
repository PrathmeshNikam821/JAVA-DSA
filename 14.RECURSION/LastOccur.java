public class LastOccur {
    public static int lastOcur(int arr[], int key, int i)
    {
        //base case
        if(i==arr.length){
            return -1;
        }

        int isFound = lastOcur(arr, key, i+1);
        if(isFound!=-1){
            return isFound;
        }

        if(arr[i]==key){
            return i;
        }
        
        return isFound;
    }

    public static void main(String[] args){
        int arr[] = { 5,5,6,7,8,9,5};
        System.out.println(lastOcur(arr, 6, 0));
    }
    
}
