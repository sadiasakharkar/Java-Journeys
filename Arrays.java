public class Arrays {
    public static void main(String[] args) {

        //method 1
        String[] cars = {"Camero" , "Corvette " , "Tesla" , "BMW"}; 
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        System.out.println(" ");

        //Method 2
        String[] car = new String[3];
        car[0] = "Camero";
        car[1] = "Corvette";
        car[2] = "Tesla";
        // System.out.println(car[0]);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

    }    
}
