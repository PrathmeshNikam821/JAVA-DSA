public class substring {
    public static String subStr(String str, int fi, int li){
        String Sub="";
        for(int i=fi; i<li;i++){
            Sub+=str.charAt(i);
        }
        return Sub;
    }
    

    public static void main(String[] args){
        String str = "HelloWorld";
        System.out.println(subStr(str, 0, 5));
        System.out.println(str.substring(0, 6));
    }
}
