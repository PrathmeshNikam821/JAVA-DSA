public class UpperCase {
    public static String ToUpper(String str){
        StringBuilder br = new StringBuilder("");
       
        char ch = Character.toUpperCase(str.charAt(0));
        br.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                br.append(str.charAt(i));
                i++;
                
                br.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                br.append(str.charAt(i));
            }


        }
        return br.toString();
    }


    public static void main(String[] args){
        String str = "hii i am pratham";
        System.out.println(ToUpper(str));
    }
    
}
