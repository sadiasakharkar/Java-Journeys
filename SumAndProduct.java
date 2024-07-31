public class SumAndProduct {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        int product = calculateProduct(array);
 
        System.out.println("The sum of the elements of the array is: " + sum);
        System.out.println("The product of the elements of the array is: " + product);
    }
 
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
 
    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }
 }
 