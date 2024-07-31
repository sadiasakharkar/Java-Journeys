public class Methods {
    public static void main(String[] args) {
        //method = a block of code that is executed whenever it is called upon.
        String name = "Sadia";
        int age = 17 ;

        int a =4,b =5;

        hello(name , age);
        sum(a, b);

    }    

    static void hello(String intro, int age){
        System.out.println("HELLO!! " + intro + " you are " + age + " Years old.");
    }

    
    static int sum(int a , int b){
        System.out.println(a+b);
        return 0;
    }
}
