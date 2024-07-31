 class Car{
    private String make;
    private String model;
    private int year;

    public Car(String make , String model , int year){
       // this.make = make;
       // this.model = model;
       // this.year = year;
       this.setMake(make);
       this.setModel(model);
       this.setYear(year);
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Camero" , 2020);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();

        car.setMake("Toyota");
        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
