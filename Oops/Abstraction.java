package Oops;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        Chicken c=new Chicken();
        //Animal a= new Animal();
        h.eat();
        c.eat();

        h.walk();
        c.walk();
        System.out.println(h.color);

        h.changeColor();
        c.changeColor();
    }
    
}

//------------------abstraction by class-----------------

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();

    String color;
    Animal(){
        color = "brown";
    }
    
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
        System.out.println(color);
    }
    void walk() {
        System.out.println("walks on 4 legs");
    };
}

class Chicken extends Animal{

    void changeColor(){
        color = "Yellow";
        System.out.println(color);
    }

    void walk() {
        System.out.println("walks on 2 legs");
    };
}

