import java.util.Scanner;

public class NestedLoops {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows;
    int coloum;
    String symbol = " ";

    System.out.println("Enter numbers of rows: ");
    rows = scanner.nextInt();

    System.out.println("Enter numbers of coloumns:");
    coloum = scanner.nextInt();

    System.out.println("Enter symbol to use : ");
    symbol = scanner.next();

    for (int i = 1; i <= rows; i++) {
        System.out.println();

        for (int j = 1; j <= coloum; j++) {
            System.out.print(symbol);
        }
    }

    scanner.close();
   } 
}
