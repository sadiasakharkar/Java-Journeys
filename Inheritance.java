public class Inheritance {

    public static class Vehical{
        double speed;

        void go(){
            System.out.println("This vehical is moving");
        }

        void stop(){
            System.out.println("This vehical is stopped");
        }
    }

    public static class Car extends Vehical{
        int wheels = 4;
        int doors = 4;
    }

    public static class Bicycle extends Vehical{
        int wheels = 2;
        int pedals =2;
    }

    public static void main(String[] args) {
        // Inheritance = the process in which one class acquires,
        //               the attributes and methods of another.

        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }    
}
