public class StringMethod {
    public static void main(String[] args) {
        String name = "Sadia";


        boolean result = name.equals("Zikra"); //This method checks for equality of two string. It is case sencetive that mean if also written as sadia it would return false 
        System.out.println(result);

        boolean newresult = name.equalsIgnoreCase("sadia"); //this check for equality and it is not case sensative 
        System.out.println(newresult);

        int num = name.length();//this returns the length of string 
        System.out.println(num);

        char ofname = name.charAt(0);//this returns the value at defined position 
        System.out.println(ofname);

        int ind = name.indexOf("i");//opposite of charat
        System.out.println(ind);

        boolean checkisempty = name.isEmpty();//to check if the string is empty 
        System.out.println(checkisempty);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String lower = name.toLowerCase();
        System.out.println(lower);


        String report = name.replace('a', 'x');//it replaces the old char to new char of the string 
        System.out.println(report);

        //More funtion are listed as
        // String result = name.trim();//it trims 

    }    
}
