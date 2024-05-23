public class palindrome {

    public static boolean IsPalindrome(String str){
        for(int i = 0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){
        String str ="raceca";
        System.out.println(IsPalindrome(str));

    }
    
}
