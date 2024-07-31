public class PrintfMethod {
    public static void main(String[] args) {
        //System.out.printf("This is a format string %d", 123 );
        //System.out.printf("\nThis is also a format specifier %c", 'z');

        boolean myboolean = true ;
        char mychar = '@';
        int myint = 50;
        double mydouble = 10000.234;
        String mystring = "Zikra";

        System.out.printf("\nThis displays the booloean value: %b", myboolean);
        System.out.printf("\nThis displays the char value: %c ", mychar);
        System.out.printf("\nThis diaplays the string value :%s" , mystring);
        System.out.printf("\nThis displays the int value: %d ", myint);
        System.out.printf("\nThis dispalys the double value: %f", mydouble);

        System.out.printf("\nHello %15s ",mystring); //Width = the minimum number of character to be written as output (act as the placeholder, in this example % 15 s ->15 is the placeholder)
        System.out.printf("\nYou have this much money %.2f ",mydouble); //sets the number of digits of presicion when outputting floating-point values

        System.out.printf("\nYou have this much money %+f ",mydouble);  // -(left justify) +(output a plus(+) or minus(-) sign for the numeric value) ,:comma grouping separators if numbers>1000
        System.out.printf("\nYou have this much money %020f ",mydouble); 
        System.out.printf("\nYou have this much money %,f ",mydouble); 
    }   
}
