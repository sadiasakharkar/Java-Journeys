import java.util.ArrayList;

public class forEachLoop {
    public static void main(String[] args) {
        //for-each = traversing technique ti iterate through the elemnt in an array / collection
        //          less steps, more readable
        //          less flexible

        //String [] animals = { "Cat" , "Dog" , "Bird"};
        
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Rat");
        
        for(String i : animals ){
            System.out.println(i);
        }
    }
}
