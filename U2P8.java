/* Write an interface called Exam with a method Pass(int mark) that returns a
Boolean. Write another interface called Classify with a method
Division(int average) which returns a string. Write a class called Result which
implements both Exam and Classify. The pass method should return true if the
marks is greater than or equal to 35 else false. The division method must return
“First” when the parameter average is 60 or more, “second” when average is 50
or more but below 60, “no division” when average is less than 50. */
import java.util.Scanner;

interface Exam {

    boolean Pass(int x);
}

interface Classify {

    String division(int y);
}

class Result implements Exam, Classify {

    public boolean Pass(int x) {
        if (x >= 35) {
            return (true);
        } else {
            return (false);
        }
    }

    public String division(int y) {
        if (y >= 60) {
            return ("First");
        } else if (y >= 50 && y <60) {
            return ("Second");
        } else {
            return ("No Division.");
        }
    }
}

class U2P8 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();
        printMessage("Enter your marks: ");
        int x = scanner.hasNextInt() ? scanner.nextInt() : 0;
        scanner.close();

        printMessage("Pass or Fail: " + result.Pass(x));
        printMessage("Division: " + result.division(x));
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
