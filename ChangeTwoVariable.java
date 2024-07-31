public class ChangeTwoVariable {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Sand";
        String temp;

        System.out.println("x : " +x);
        System.out.println("y : " +y);

        temp = x;
        x = y;
        y = temp;

        System.out.println(" ");
        System.out.println("The Changed values are ....");
        System.out.println("x : " +x);
        System.out.println("y : " +y);
    }
}
