public class StaticKeyword {

    public static class Friend{
        String name;
        static int numberOFFriends;

        Friend (String name){
            this.name = name;
            numberOFFriends++;
        }

        static void displayFriends(){
            System.out.println("You have "+numberOFFriends+" Friends!!");
        }
    }
    
    public static void main(String[] args) {
        // ststic = modifier . A single copy of a variable /method is created and shared.
        //          The class "owns" the static member

        Friend friend1 = new Friend("Sadaf");
        //System.out.println(Friend.numberOFFriends);

        Friend friend2 = new Friend("Zikra");
       // System.out.println(Friend.numberOFFriends);

        Friend friend3 = new Friend("Hafsa");
       // System.out.println(Friend.numberOFFriends);
       Friend friend4 = new Friend("Sidra");

       Friend.displayFriends();

    }    
}
