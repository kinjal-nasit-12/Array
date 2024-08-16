/* Write a program to create an array to store 5 integer values. Also
initialize the array with 5 numbers and display the array Elements
in reverse order. */
import java.util.Scanner;
class U2P2
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        printMessage("Enter element of the array: ");
        int numberOfElements = getIntegerValue(s);
        if (numberOfElements == 0) {
            printMessage("Elements cannot be 0.");
            return;
        }
        int array[] = new int[numberOfElements];
        printMessage("Enter " + numberOfElements + " integer values: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=getIntegerValue(s);
            printMessage("a [" + i + "]= " + array[i]);
        }

        printMessage("array in reverse order.");
        for (int i = array.length - 1; i >= 0; i--) {
            printMessage("a [" + i + "]= " + array[i]);
        }
        s.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int getIntegerValue(Scanner s) {
        return s.hasNextInt() ? s.nextInt() : 0;
    }
}
