import java.util.*;
public class income_tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float tax;

        float income = sc.nextFloat();
        if(income<500000){
            tax = 0;


        }
        else if(income>=500000 && income<1000000 ){
            tax = income*(0.2f);
        }
        else{
            tax = income*(0.3f);
        }
        System.out.println(tax);

    } 
}
