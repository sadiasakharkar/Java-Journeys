public class ObjectPassing {
    public static class Garage{
       void park(Car car){
            System.out.println("The " + car.name + " is parked in the garage!!");
       }
    }

    public static class Car{
        String name;

        Car(String name){
            this.name = name;
        }
    }
    
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("BMW");

        garage.park(car1);

        Car car2 = new Car("Tesla");
        garage.park(car2);
    }
}
