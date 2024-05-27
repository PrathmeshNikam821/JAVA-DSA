public class Oops{
    public static void main(String[] args){
        pen p1 = new pen();
        p1.setColor("Yellow");
      System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }

}
 
class pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }
    String getColor(){
        return color;
    }

    int getTip(){
        return tip;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}