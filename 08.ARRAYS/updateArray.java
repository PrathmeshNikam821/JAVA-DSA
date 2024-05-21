public class updateArray {


    public static void update(int marks[], int x){
        //arrays work on call by reference
        x =10;
        for(int i =0; i<marks.length ; i++){
            marks[i] = marks[i]+1;

        }

    }



    public static void main(String[] args){

        int marks[] = { 98 , 99 , 97};
        int x =45;
        update(marks,x);

        System.out.println(x);
        for(int i = 0; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println();

    }
    
}
