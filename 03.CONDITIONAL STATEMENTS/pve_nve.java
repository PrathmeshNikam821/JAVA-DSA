import java.util.*;
public class pve_nve {
    public static void main(String[] args){
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        num = sc.nextInt();
        String result = (num>=0)?"positive":"negative";
        System.out.println(result);
        
    }
}
