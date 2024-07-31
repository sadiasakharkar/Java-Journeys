public class SuperKeyword {

    public static class Person {
        String name;
        int age;

        Person() {
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Hero extends Person {
        String power;

        Hero(String name, int age, String power) {
            super(name, age);
            this.power = power;
        }
    }

    public static void main(String[] args) {
        // super = keyword refers to the superclass (parent) of 
        //         an object very similar to the "this" keyword

        Hero hero1 = new Hero("Batman", 42, "$$$");
        System.out.println(hero1);
        
    }    
}
