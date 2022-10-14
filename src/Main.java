import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static double[ ] exampleArray = {1,5,6,5,4,1};

    public static void main(String[] args) {
        System.out.println("Calling sumArray, should return 22.0");
        System.out.printf("Method sumArray returned: %.1f\n\n", sumArray());

        System.out.println("Fixed errors in sample code:");
        System.out.printf("\tLine %d: removed 's' from 'examplesArray'.\n", 34);
        System.out.printf("\tLine %d: removed '>' from end of for loop condition expression.\n", 37);
        System.out.println("Calling maxArrayPosition, should return 2.");
        System.out.printf("Method maxArrayPosition returned: %d\n", maxArrayPosition());

        System.out.println("Calling toPower(5, 2)");
        System.out.println("\tShould return [0, 1, 4, 9, 16]");
        System.out.println("Returned: " + Arrays.toString(toPower(5, 2)));
        System.out.println("\nCalling toPower(6, 3)");
        System.out.println("\tShould return [0, 1, 8, 27, 64, 125]");
        System.out.println("Returned: " + Arrays.toString(toPower(6, 3)));
    }

    public static double sumArray() {
        double sum = 0;
        for ( double num : exampleArray) {
            sum += num;
        }
        return sum;
    }

    public static int maxArrayPosition() {
        double maximum = exampleArray[0];
        int index = 0;

        for (int i = 1; i < exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }
        }
        return index;
    }

    public static Integer[] toPower(int size, int power) {
        ArrayList<Integer> outputArray = new ArrayList<>(size);
        double calcHold = 0.0;

        for (int loop = 0; loop < size; loop++) {
            calcHold = Math.pow(loop, power);
            outputArray.add((int) Math.round(calcHold));
        }
        return outputArray.toArray(new Integer[0]);
    }
}