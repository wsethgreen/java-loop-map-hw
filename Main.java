import java.util.*;


public class Main {

    public static void main(String[] args) {
        

        /*
        Write a program that does the following:
            Asks the user for 5 numbers
            Stores them in an array list
            Finds the sum, product, largest, and smallest of those numbers
        */

        ArrayList<Integer> intArr = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        // Ask the user to enter 5 numbers

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            intArr.add(num);
        }

        System.out.printf("Your array: %s\n", intArr);

        // Find the max and min using Collections.

        int arrMax = Collections.max(intArr);
        int arrMin = Collections.min(intArr);
        
        // Find the product and sum using a for loop.

        int arrSum = 0;
        int arrProduct = 1;

        for (int i = 0; i < intArr.size(); i++) {
            arrSum += intArr.get(i);
            arrProduct *= intArr.get(i);
        }

        System.out.printf("Max: %s\n Min: %s\n Sum: %s\n Product: %s\n", arrMax, arrMin, arrSum, arrProduct);
        
    }
}