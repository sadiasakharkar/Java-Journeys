public class OddNumbersPrinter {
    public static void main(String[] args) {
        System.out.println("Odd numbers:");
        printOddNumbers();
    }

    static void printOddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}


