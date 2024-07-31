public class FuncReturn {
    public static void main(String[] args) {
        int z = area(5, 7) + area(3, 4) + area(6, 2);
        System.out.println("Total area: " + z);
    }

    static int area(int l, int b) {
        int a = l * b;
        return a;
    }
}

