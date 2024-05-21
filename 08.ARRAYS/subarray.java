public class subarray{


    public static void subarrays(int arr[]){
        int sum = arr[0];
        int min = arr[0];
        int[] mins = new int[10];
        int[] max= new int[10];
        for (int i = 0; i<arr.length ; i++){
            //start
            for(int j = i ; j<arr.length; j++){

                //end
                int currsum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    currsum+=arr[k];
                }
                if(sum<currsum){
                    sum=currsum;
                    for(int l=i;l<=j;l++){
                        max[l]=arr[l];
                    }
                }

                if(min>currsum){
                    min=currsum;
                    for(int l = i; l<=j;l++){
                        mins[l] = arr[l];
                    }

                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("The max sum is "+sum);
        System.out.println("the array is :");
        for(int i=0; i<max.length;i++){
            System.out.print(max[i]+" ");
        }
        System.out.println();
        System.out.println("The min sum is "+min
        );
        System.out.println("the array is :");
        for(int i = 1; i<mins.length; i++){
            System.out.print(mins[i]+" ");
        }
    }


    public static void main(String[] args){
        int arr[]={45, 43, 34, 56, 67, 90};
        subarrays(arr);
    }
    
}
