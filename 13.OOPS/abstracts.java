public class abstracts {
    public static void main(String[] args){

        Horse horsee = new Horse();
        horsee.eat();
        horsee.walk();
        System.out.println(horsee.color);

    }
    
}

abstract class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    Animal(){
        color ="brown";
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        color = "black";
    }

    void walk(){
        System.out.println("Runs");
    }



}


