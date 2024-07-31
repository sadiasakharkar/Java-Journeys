public class TwodArray {
   public static void main(String[] args) {
    // 2D array = an array of arrays

    // Method 1
    // String [] [] cars = new String[3][3];

    // cars[0][0] = "Camero ";
    // cars[0][1] = "Corvette ";
    // cars[0][2] = "Silverdo ";
    
    // cars[1][0] = "Mustang ";
    // cars[1][1] = "Ranger ";
    // cars[1][2] = "F-150 ";

    // cars[2][0] = "Porche ";
    // cars[2][1] = "Ferrari ";
    // cars[2][2] = "Lambo ";

    // for (int i = 0; i < cars.length; i++) {
    //     System.out.println();
    //     for (int j = 0; j < cars[i].length; j++) {
    //         System.out.print(cars[i][j]+" ");
    //     }
    // }


    String[][] cars = {{"Camero " , "Corvette " , "Silverdo "} ,
                       {"Mustang " , "Ranger " , "F-150 "} ,
                      {"Porche  " , "Ferrari  " , " Lambo "}};


    for (int i = 0; i < cars.length; i++) {
             System.out.println();
             for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
             }
   }
   } 
}
