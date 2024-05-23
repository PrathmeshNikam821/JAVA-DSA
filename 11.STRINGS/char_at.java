public class char_at {

    public static void print(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        String full = " Prathmesh Nikam.";
        print(full);
    }
    
}
