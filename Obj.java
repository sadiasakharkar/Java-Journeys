class Rectangle {
    int length, breadth;

    void area() {
        int a = length * breadth;
        System.out.println("Area = " + a);
    }

    void perimeter() {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter = " + p);
    }
}

public class Obj {
    public static void main(String[] args) {
        Rectangle a, b;
        a = new Rectangle();
        b = new Rectangle();
        a.length = 3;
        a.breadth = 4;
        b.length = 5;
        b.breadth = 7;
        a.perimeter();
        a.area();
        b.perimeter();
        b.area();
    }
}

