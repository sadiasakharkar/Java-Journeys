class Rectangle {
    private int length, breadth;

    public void area() {
        int a = length * breadth;
        System.out.println("Area = " + a);
    }

    public void perimeter() {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter = " + p);
    }

    public void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }
}

public class Setter {
    public static void main(String[] args) {
        Rectangle a, b;
        a = new Rectangle();
        b = new Rectangle();
        a.setDimensions(45, 50);
        b.setDimensions(30, 60);
        a.perimeter();
        a.area();
        b.perimeter();
        b.area();
    }
}

