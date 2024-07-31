public class Constructors {

    public static class Human{

        String name ;
        int age;
        double weight;
        
        Human(String name, int age , double weigth){
            this.name = name ;
            this.age = age ;
            this.weight = weight ;
        }

        void eat(){
            System.out.println(this.name +" is eating!!");
        }

        void drink(){
            System.out.println(this.name +" is drinking!!!");
        }

    }

    public static void main(String[] args) {

        //constructor = constructor is a special method that is called when an object is instantiated (created)

        Human human1 = new Human("bro" , 20 , 70);
        System.out.println(human1.name);

        Human human2 = new Human("Mortay" , 17 , 45);
        System.out.println(human2.name +" "+ human2.age);

        human2.eat();
        human1.drink();
        
    }
}