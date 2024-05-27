public class override {

    public static void main(String[] args){
        Deer der = new Deer();
        der.eat();
        Animal and = new Animal();
        and.eat();

    }
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats deer");
    }
}
