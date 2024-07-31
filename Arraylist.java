import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //ArrayList = a resizable array. Elements can be added and removed after complition phase 
        //            store refrence data type.

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Hamburger");

        food.set(0 , "Sushi");
        food.remove(2); // to delete 
        // food.clear();        // to clear list 

        for(int i = 0 ; i < food.size() ; i++){
            System.out.println(food.get(i));
        }
    }    
}