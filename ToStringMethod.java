public class ToStringMethod {

    public static class Car{
        String make = "Ford";
        String model = "Mustang";
        String color = "Red";
        int year = 2021;

        public String toString() {
            return make +"\n" +model +"\n" +color+ "\n" +year+ "\n";
        }
    }

    public static void main(String[] args) {
        //toString() = toString Method is special method that all the object inherit,
        //             that returns a string that "textually represents " an object. 
        //             can be used both implicitly and explicitly 
        
        Car car = new Car();

        System.out.println(car); //address where could find car object in your computers memory
        //System.out.println(car.toString());// same thing it return the address where could find the car object in your computer's memory if constructor is not made 

        System.out.println(car.toString()); //this is called explicitly
        System.out.println(car); //same result like upper this is called implicitly
        

        // System.out.println(car.model);
        // System.out.println(car.make);
        // System.out.println(car.color);
        // System.out.println(car.year);

    }    
}
