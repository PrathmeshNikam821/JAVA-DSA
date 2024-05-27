public class method_over {
    public static void main(String[] args){

        Calculator cal = new Calculator();
        System.out.println(cal.sum(4.5f, 4.5f));
        System.out.println(cal.sum(4,5.09f));
        System.out.println(cal.sum(3,4,5));

    }
    
}

class Calculator{

    int sum(int a , int b){
        return a+b;
    }

    float sum(float a , float b){
        return a+b;
    }

    int sum(int a , int b , int c ){
        return a+b+c;
    }
}
