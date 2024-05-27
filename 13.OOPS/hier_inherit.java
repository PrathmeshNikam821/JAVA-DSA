public class hier_inherit {
    public static void main(String[] args){

        Fish auto = new Fish();
        Birds bird = new Birds();
        Mammals mamm = new Mammals();
        auto.eat();
        auto.breath();
        auto.swim();

        bird.eat();
        bird.breath();
        bird.fly();

        mamm.eat();
        mamm.breath();
        mamm.walk();


    }
    
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks ");
    }
}
