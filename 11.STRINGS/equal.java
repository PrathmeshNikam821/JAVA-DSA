public class equal {
    public static void main(String[] args)
    {
        String s1 = "Pratham";
        String s2 = "Pratham";
        String s3 = new String("Pratham;");
        if(s1.equals(s3)){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }

    }
    
}
