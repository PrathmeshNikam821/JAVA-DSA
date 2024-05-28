public class friendpair {
    public static int friendpairs(int n){
        if(n==1|| n==2){
            return n;
        }

        return friendpairs(n-1)+(n-1)*friendpairs(n-2);
    }

    public static void main(String[] args){
        System.out.println(friendpairs(3));
    }
    
}
