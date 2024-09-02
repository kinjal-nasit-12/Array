/* Write an interface called numbers, with a method in Process(int x, int y) Write a
class called Sum, in which the method Process finds the sum of two numbers and
returns an int value. Write another class called Average, in which the Process
method finds the average of the two numbers and returns an int. */
import java.util.Scanner;
interface Numbers {
    float Process(int x, int y);
}

class Sum implements Numbers {
    public float Process(int x, int y) {
        return x + y;
    }
}

class Average implements Numbers {
    public float Process(int x, int y) {
        return (float) (x + y) / 2;
    }
}

class U2P5 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Sum sum = new Sum();
        Average avg = new Average();
        printMessage("Enter integer value 1: ");
        int x = scanner.hasNextInt() ? scanner.nextInt() : 0;
        printMessage("Enter integer value 2: ");
        int y = scanner.hasNextInt() ? scanner.nextInt() : 0;
        scanner.close();
        printMessage("Sum of two numbers: " + sum.Process(x, y));
        printMessage("Average is: " + avg.Process(x, y));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
