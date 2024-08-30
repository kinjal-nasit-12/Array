/* Write a program to find sum of two matrices of 3 x3. */
import java.util.Scanner;

class U2P3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter the number of rows and columns for the matrices: ");
        int rows = scanner.hasNextInt() ? scanner.nextInt():0;
        int columns = scanner.hasNextInt() ? scanner.nextInt():0;

        int[][] mOne = getMatrix(scanner, rows, columns);
        int[][] mTwo = getMatrix(scanner, rows, columns);

        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = mOne[i][j] + mTwo[i][j];
            }
        }
        printMessage("Sum of the two matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int[][] getMatrix(Scanner scanner, int rows, int columns) {
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.hasNextInt() ? scanner.nextInt() : 0;
            }
        }
        return matrix;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
