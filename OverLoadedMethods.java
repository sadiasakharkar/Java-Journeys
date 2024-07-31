public class OverLoadedMethods {
    public static void main(String[] args) {
        //same as function overloading
       int x = add(5, 6);
       int y = add(3, 6, 9);
       float z = add(3.14f, 5.12f);
       double d = add(5.10, 6.13);

       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println(d);

    }    

    static int add(int a , int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }

    static int add (int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }

    static float add (float a, float b){
        System.out.println("This is overloded method #3 ");
        return a+b;
    }

    static double add(double a , double b){
        System.out.println("This is overloaded method #4");
        return a+b;
    }
}
