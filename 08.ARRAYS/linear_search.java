public class linear_search {

    public static int linearSearch(int numbers[], int key){
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int numbers[] = { 12, 45, 34, 56, 43, 89 , 90, 98};
        int key = 89;
        int index =linearSearch(numbers, key);


        if(index==-1){
            System.out.println("Not found ");
        }

        else{
            System.out.println("The index at "+index);
        }


    }



    
}
