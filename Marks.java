import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        System.out.println("Result");
        System.out.println("To check your result please enter right marks obtian bu pupil");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 1st language:");
        int a = sc.nextInt();
        System.out.print("Enter marks of 2nd language:");
        int b = sc.nextInt();
        System.out.print("Enter marks of 3rd language:");
        int c = sc.nextInt();
        System.out.print("Enter marks of 4th language:");
        int d = sc.nextInt();
        System.out.print("Enter marks of 5th language:");
        int e = sc.nextInt();
         
        double result = ((double) (a + b + c + d + e) / 500) * 100;
        
        System.out.println("Your result is:" +result);
        // System.out.println(result);

        sc.close();
    }
    
}
