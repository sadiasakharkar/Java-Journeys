import java.util.Scanner;

public class LogicalOprators {
    public static void main(String[] args) {
        // int temp = 25;
        // if (temp > 30 ) {
        //     System.out.println("It is hot outside");
        // }
        // else if (temp>=20 && temp <=30) {
        //     System.out.println("It is warm outside.");
        // }
        // else{
        //     System.out.println("It is cold outside");
        // }


        Scanner scaner = new Scanner(System.in);

        System.out.println("You are playing a game. Press q or Q to quit");
        String respone = scaner.next();

        if (respone.equals("q")|| respone.equals("Q")) {
                System.out.println("You Quit the game");                        
        }
        else{
            System.out.println("You are still in the game *Pew Pew*");

            scaner.close();
        }
    }
}
