/* Create class calculation with an abstract method area( ). Create Rectangle and
Triangle subclasses of calculation and find area of rectangle and triangle. */
import java.util.Scanner;
abstract class Calculation {
    abstract void area(float a, float b);
}
class Rectangle extends Calculation {
    public void area(float a, float b) {
        float c = a * b;
        System.out.println("Area of rectangle is : " + c);
    }
}
class Triangle extends Calculation {
     public void area(float a, float b) {
        float c = (a + b) / 2;
        System.out.println("Area of Triangle is : " + c);
    }
}
class U2P9 {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter length : ");
        float a = scanner.hasNextFloat() ? scanner.nextFloat() : 0;
        printMessage("Enter width: ");
        float b = scanner.hasNextFloat() ? scanner.nextFloat() : 0;
        scanner.close();
        rectangle.area(a, b);
        triangle.area(a, b);
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
