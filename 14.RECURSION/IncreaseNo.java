public class IncreaseNo {

    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        printInc(10);
    }
    
}
