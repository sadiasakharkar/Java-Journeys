public class MathClass {
    public static void main(String[] args) {
        double x =3.14;
        double y = -10;

        double z = Math.max(x, y);
        double m = Math.min(x, y);
        double a= Math.abs(y);
        double s = Math.sqrt(x);
        double t = Math.pow(x, y);
        double u = Math.round(x);
        double c = Math.ceil(x);

        System.out.println(m);
        System.out.println(z);
        System.out.println(a);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(c);
    }
}
