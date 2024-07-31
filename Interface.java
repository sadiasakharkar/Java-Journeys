interface Prey{
    void flee();
}
interface Predetor{
    void hunt();
}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit is fleeing");
    }

}

class Hawk implements Predetor{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting!!");
    }
}

class Fish implements Prey, Predetor{
    @Override
    public void flee(){
        System.out.println("The small fish flees>>");
    }

    public void hunt(){
        System.out.println("The big fish hunts small fish..");
    }
}

public class Interface {
    public static void main(String[] args) {
        /*interface = a template that can be applied to a class .
         *            similar to inheritance , but specifies what a class has / must do .
         *            classess can apply more than one interface , inheritance is limited to 1 super class.
         */

         System.out.println();
         Rabbit rabbit = new Rabbit();
         rabbit.flee();


         System.out.println();
         Hawk hawk = new Hawk();
         hawk.hunt();

         System.out.println();
         Fish fish = new Fish();
         fish.flee();
         fish.hunt();
         System.out.println();

    }    
}
