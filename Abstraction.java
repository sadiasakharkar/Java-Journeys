import Inheritance.Car;

public abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("The Dog is eating....");
    }

    static void bark(){
        System.out.println("The dog barks...");
    }
}

public class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("The cat is eating...");
    }

    static void meow(){
        System.out.println("The cat meowssss...");
    }
}

public class Abstraction {
        public static void main(String[] args) {

            Dog dog = new Dog();
            dog.eat();
            dog.bark();

            Cat cat = new Cat();
            cat.eat();
            cat.meow();

        }
}
