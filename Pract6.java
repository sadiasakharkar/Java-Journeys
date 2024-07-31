class Box {
    private int length, breadth, height;

    public void volume() {
        int v = length * breadth * height;
        System.out.println("Volume = " + v);
    }

    public void setDimensions(int x, int y, int z) {
        length = x;
        breadth = y;
        height = z;
    }
}

public class Pract6 {
    public static void main(String[] args) {
        Box a = new Box();
        a.setDimensions(23, 56, 89);
        a.volume();
    }
}

