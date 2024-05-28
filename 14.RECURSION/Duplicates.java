
public class Duplicates{
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char CurrChar = str.charAt(idx);
        if(map[CurrChar -'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[CurrChar -'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(CurrChar), map);
        }
    }

    public static void main(String[] args ){
        String str="pratham";
        removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
    }
}