import java.util.Random;

public class VariableScope {

    public static class DiceRoller{

        Random random;
        int number;

        DiceRoller(){
            random = new Random();
            roll();
        }

        void roll(){
            number = random.nextInt(6)+1;
            System.out.println(number);
        }

    }
    
    public static void main(String[] args) {
        //local variable = declared inside the method visible only to that method

        //global variable = declared outside a method , but within a class visible to all parts of a class

        DiceRoller diceroller = new DiceRoller();

    }
    
}
