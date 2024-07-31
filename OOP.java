public class OOP {
    public static void main(String[] args) {
        //objects = an instance of a class that may contain attributes and methods.

        Car myCar = new Car();
        Car newcar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        System.out.println();
        System.out.println(newcar.year);
        System.out.println(newcar.price);
        // myCar.drive();
        // myCar.brake();
    }

    public static class Car{
        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "Blue";
        double price = 500000.00;

        void drive(){
            System.out.println("You drive the car");
        }

        void brake(){
            System.out.println("You step on the brakes");
        }
    }
}
