import java.util.*;

public class TwoDArraylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList <String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Dounts");

        ArrayList <String> productList = new ArrayList();
        productList.add("Tomatoes");
        productList.add("Zuccchini");
        productList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Soda");
        drinksList.add("Tea");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);

        System.out.println(" ");
        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));
    }    
}
