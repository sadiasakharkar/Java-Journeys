public class OverlodedConstructors {

    public static class Pizza{
        String bread;
        String sauce;
        String cheese;
        String topping;

        Pizza(String bread, String sauce , String cheese , String topping){
            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
            this.topping = topping;
        }

        Pizza(String bread , String sauce ,String cheese){
            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
        }
    }
    public static void main(String[] args) {
        // constructor overloading = multiple constructor within a class with the same name , 
        //                          but different parameters name + parametrs = signature 

        Pizza pizza = new Pizza("Thick Crust" , "Tomato " , "Mozzerella" , "Peperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);

        System.out.println();

        Pizza plain = new Pizza("Thin Crust " , "Chilly Tomato" , "Chedder");
        System.out.println("Here are the ingredient of your plain pizza: ");
        System.out.println(plain.bread);
        System.out.println(plain.sauce);
        System.out.println(plain.cheese);

    }
}
