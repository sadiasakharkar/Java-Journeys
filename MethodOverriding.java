public class MethodOverriding {

    public static class Animal{
        void speak(){ // overriding method
            System.out.println("The animal speaks!");
        }
    }

    public static class Dog extends Animal{
        @Override
        void speak(){ //overriden method
            System.out.println("The animal goes *Barkkk*");
        }
    }

    public static void main(String[] args) {
        // method overriding = Declaring a method in sub class ,
        //                     which is arleady present in parent class . 
        //                      done so that a child class can give its own implementation

        Animal animal = new Animal();
        animal.speak();


        Dog dog = new Dog();
        dog.speak();

    }    
}