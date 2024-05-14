import java.util.*;
public class leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's Leap year");
                }
                else{
                    System.out.println("not a leap year.");
                }
            }
            else{
                System.out.println("it is leap year.");
            }
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}
