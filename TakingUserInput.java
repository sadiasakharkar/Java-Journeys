import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();
        
        System.out.println(" ");
        System.out.println("Hello, " +name+ ". How are you!!");
        System.out.println("Okayyy so you are " +age+ " years old!!");
        System.out.println("Your favourite food is " +food);

        scanner.close();
        
    }
}
