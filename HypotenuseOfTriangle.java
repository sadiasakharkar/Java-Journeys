import java.util.Scanner;

//Hypotenuse of the triangle
public class HypotenuseOfTriangle {
    public static void main(String[] args) {
        double x, y, z ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x : ");
        x = scanner.nextDouble();

        System.out.println("Enter side y : ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is  : "+z);

        scanner.close();
        
    }
}
