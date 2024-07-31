import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From user ");
        Scanner sc = new Scanner(System.in); // new Scanner(System.in) this is object

        //Finding sum of two numbers by taking input
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        //float b = sc.nextFloat() -- example it can be used with any datatype
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of these numbers is : ");
        System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);


        //to copy the same word or line using sc.nextLine() function 
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();

    }
    
}
