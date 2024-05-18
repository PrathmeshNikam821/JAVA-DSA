import java.util.*;
public class binToDec {
    public static void binDec(int binNum){
        int pow = 0;
        int decNum = 0;
        int mynum = binNum;
        
        while(binNum>0){

            int lastDigit = binNum%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println("the decimal of "+mynum+" is "+decNum);
    }

    public static void main(String[] args){
            binDec(1011);
            binDec(11111);
    }

    
}
