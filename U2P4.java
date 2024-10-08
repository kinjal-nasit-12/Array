
/* Write program to create an array of company name and another array of price
quoted by the company. Fetch the company name who has quoted the lowest
amount. */
import java.util.Scanner;

class U2P4 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Please enter number of companies that you want to enter: ");
        int n = scanner.hasNextInt() ? scanner.nextInt() : 0;

        if (n <= 0) {
            printMessage("You must enter a number greater than 0 for the number of companies.");
        } else {
            int a[] = new int[n];
            String string[] = new String[n];
            for (int i = 0; i < n; i++) {
                printMessage("Enter company name: ");
                string[i] = scanner.next();
                printMessage("Enter quotation: ");
                a[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
            }
            int min = a[0];
            int j = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                    j = i;
                }
            }
            printMessage("Name of the company : " + string[j] + " with lowest Quotation: " + a[j]);
        }
        scanner.close();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
