public class ArrayOfObjects {

    public static class Food{
        String name;

        Food(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hot-Dog");

        Food[] refrigerator = {food1 , food2 , food3};

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
