public class shortespath {
    public static float getShortPath(String str){
        int x =0, y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }

            else if(str.charAt(i)=='W'){
                x--;
            }

            else if(str.charAt(i)=='S'){
                y--;
            }

            else if(str.charAt(i)=='E'){
                x++;
            }
        }
        
                    int x2 = x*x;
                    int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args){
        String str = "NWESNW";
        System.out.println(getShortPath(str));
    }
}
