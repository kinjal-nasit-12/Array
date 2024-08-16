/* Write a program to find sum of two matrices of 3 x3. */
import java.util.Scanner;
class U2P3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[][] mOne = getMatrix(scanner,3, 3);
        int[][] mTwo = getMatrix(scanner,3, 3);
        scanner.close();

        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = mOne[i][j] + mTwo[i][j];
            }
        }
        System.out.println("Sum of the two matrices: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println( );
        }
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
}
