public class WrapperClasses {
   public static void main(String[] args) {
    
    //Wrapper class = provides a way to use primitive datatypes as refrence data types refrence data types contain useful methods can be used with collections (ex.ArrayList) 

    //  primitive      //wrapper
    //  -------        //------
    //  boolean        Boolean 
    //  char           Character
    //  int            Integer
    //  double         Double

    // autoboxing = the automatic convertion that the java compiler makes between the primitive types and their corresponding object wrapper classes
    // unboxing = the reverse of autoboxing . Autoboxing conversion of wrapper class to primitive
    
    Boolean a = true;
    Character b = '#';
    Integer c = 123;
    Double d = 3.14;
    String e = "Sadia";
    
    System.out.println(a + " " + b + " " + c + " " + d + " " + e );

    if (a== true) {
        System.out.println("This is true");
    }

    if (b=='#') {       
        System.out.println("This is true");
    }

   }
}
