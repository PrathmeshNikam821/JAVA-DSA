public class poewer {
    public static int poewerof(int x, int n){
        if(n==1){
            return x;
        }


        return x*poewerof(x, n-1);
    }

    public static int reduce(int x , int n){
        if(n==1){
            return x;
        }

        int halfPower = reduce(x, n/2);
        int square = halfPower * halfPower;

        if(n%2!=0){
            square = x * square;
        }

        return square;
    }
    

    public static void main(String[] args){
        System.out.println(poewerof(2, 5));
        System.out.println(reduce(2, 10));
    }
    
}
