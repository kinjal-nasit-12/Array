
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

class Printer {
    public Scanner scanner;

    public Printer(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}

class NumberData extends Printer {

    int numberOfArray[];

    public NumberData(Scanner scanner) {
        super(scanner);
    }

    public void createArray() {
        printMessage("Enter number of array that you want to processs: ");
        int n = scanner.hasNextInt() ? scanner.nextInt() : 0;
        numberOfArray = new int[n];
        for (int i = 0; i < numberOfArray.length; i++) {
            printMessage("Enter element " + i + ": ");
            numberOfArray[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
        }
    }
}

class NumPlay extends NumberData {

    public NumPlay(Scanner scanner) {
        super(scanner);
    }

    public void display() {
        for (int i = 0; i < numberOfArray.length; i++) {
            printMessage("Element " + i + ": " + numberOfArray[i]);
        }
    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < numberOfArray.length; i++) {
            sum += numberOfArray[i];
        }
        printMessage("Sum is: " + sum);
    }

    public void average() {
        int sum = 0;
        for (int i = 0; i < numberOfArray.length; i++) {
            sum += numberOfArray[i];
        }
        float average = (float) sum / numberOfArray.length;
        printMessage("Average is: " + average);
    }

    public void max() {
        int maximum = 0;
        for (int i = 0; i < numberOfArray.length; i++) {
            if (maximum < numberOfArray[i]) {
                maximum = numberOfArray[i];
            }
        }
        printMessage("Maximum is: " + maximum);
    }

    public void min() {
        int minimum = numberOfArray[0];
        for (int i = 0; i < numberOfArray.length; i++) {
            if (minimum > numberOfArray[i]) {
                minimum = numberOfArray[i];
            }
        }
        printMessage("Minimum is: " + minimum);
    }
}

public class U2P6 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        NumPlay object = new NumPlay(scanner);
        object.createArray();
        int choice;
        object.printMessage("\nMenu: ");
        object.printMessage("1.Display numbers entered.");
        object.printMessage("2.Sum of numbers.");
        object.printMessage("3.Average of numbers.");
        object.printMessage("4.Maximum of numbers.");
        object.printMessage("5.Minimum of numbers.");
        object.printMessage("6.Exit.");
        object.printMessage("Enter your choice: ");
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
                object.printMessage("Exiting the program.");
                break;
            default:
                object.printMessage("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
