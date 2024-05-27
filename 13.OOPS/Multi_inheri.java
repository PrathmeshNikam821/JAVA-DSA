public class Multi_inheri {
    public static void main(String[] args){
        Dog doggy = new Dog();
        doggy.eat();
        doggy.breath();
        doggy.legs();
        doggy.breed();


    }
    
    
}

class Animal{
    void eat(){
        System.out.println(" Eats ");
    }

    void breath(){
        System.out.println("Breaths");
    }
}


class Mammals extends Animal{
    void legs(){
        System.out.println("4 legs");
    }
}


class Dog extends Mammals{
    void breed(){
        System.out.println("Dog");
    }
}