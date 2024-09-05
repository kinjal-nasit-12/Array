/* Create a class called NumberData that accept any array of the five numbers.
Create a sub class called Numplay which provides methods for followings:
1. Display numbers entered.
2. Sum of the number.
3. Average of the numbers.
4. Maximum of the numbers.
5. Minimum of the numbers.
Create a class that provides menu for above methods. Give choice from the
command-line argument. */
import java.util.Scanner;
class NumberData {

    int a[] = new int[5];
    Scanner scanner = new Scanner(System.in);
    public static void printMessage(String message) {
        System.out.println(message);
    }
    public void createArray() {
        for (int i = 0; i < a.length; i++) {
            printMessage("Enter element " + i + ": ");
            a[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
        }
    }
}

class NumPlay extends NumberData {

    public void display() {
        for (int i = 0; i < 5; i++) {
            printMessage("Element " + i + ": " + a[i]);
        }
    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        printMessage("Sum is: " + sum);
    }

    public void average() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        float average = (float) sum / 5;
        printMessage("Average is: " + average);
    }

    public void max() {
        int maximum = 0;
        for (int i = 0; i < 5; i++) {
            if (maximum < a[i]) {
                maximum = a[i];
            }
        }
        printMessage("Maximum is: " + maximum);
    }

    public void min() {
        int minimum = a[0];
        for (int i = 0; i < 5; i++) {
            if (minimum > a[i]) {
                minimum = a[i];
            }
        }
        printMessage("Minimum is: " + minimum);
    }
}

public class U2P6 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        NumPlay object = new NumPlay();
        object.createArray();
        int choice;
        printMessage("1.Display numbers entered.");
        printMessage("2.Sum of numbers.");
        printMessage("3.Average of numbers.");
        printMessage("4.Maximum of numbers.");
        printMessage("5.Minimum of numbers.");
        printMessage("6.Exit.");
        printMessage("Enter your choice: ");
        choice = scanner.hasNextInt() ? scanner.nextInt() : 0;
        switch (choice) {
            case 1:
                object.display();
                break;
            case 2:
                object.sum();
                break;
            case 3:
                object.average();
                break;
            case 4:
                object.max();
                break;
            case 5:
                object.min();
                break;
            case 6:
                printMessage("Exiting the program.");
                break;
            default:
                printMessage("Invalid choice.");
                break;
        }
        scanner.close();
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
