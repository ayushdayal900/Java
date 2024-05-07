package clg;
import java.util.*;



public class psp2{
    public static void main(String[] args)
	{
        Child ch = new Child();
        ch.p();
        ch.c();

        Dog d = new Dog();
        Cat c = new Cat();
        Man m = new Man();

        System.out.println();
        d.bark();
        d.eat();
        System.out.println();

        c.drink();
        c.eat();
        System.out.println();

        m.eat();
        m.speak();
    }
}

//----------------------------- simple inheritence ----------------------------

class Parent {
	public void p()
	{
		System.out.println("Ayush");
	}
}

class Child extends Parent {
	public void c() { System.out.println("Dayal"); }
}

//---------------------------- hirerchical inheritance -------------------------

class Animal{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	public void bark() { System.out.println("Dog is barking"); }
}

class Cat extends Animal {
	public void drink() { System.out.println("Cat is drinking"); }
}

class Man extends Animal {
	public void speak() { System.out.println("Man is speaking"); }
}

//-------------------------- hybrid ---------------------------------------

//public class GrandFather {

    
//}



//-------------------------- multiple ---------------------------------------------

class Vegetables{
	public void mix()
	{
		System.out.println("mixing vegetables");
	}
}

class Tomato extends Vegetables{
	public void Tomatoo() { System.out.println("Tomato is added"); }
}

/*public interface Potato {
    public void Potatoo() { System.out.println("Potato is added"); }
}

class Bhaji extends Tomato Potato{
	public void speak() { System.out.println("Bhaji is ready"); }
}*/








