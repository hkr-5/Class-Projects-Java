/**
 * Hikaru Yamamoto
 * CS170
 * 04 23, 2020
 */

public class RectangleTest extends Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(3.0);
        r1.setLength(5.2);
        r1.printDimensions();
        System.out.println();
        
        Rectangle r2 = new Rectangle(2.6, 5.4);
        System.out.printf("Width: %.2f\n", r2.getWidth());
        System.out.printf("Length: %.2f\n", r2.getLength());
        System.out.println();
        
        System.out.printf("R1 Area: %.2f\n", r1.calculateArea());
        System.out.printf("R1 Perimeter: %.2f\n", r1.calculatePerimeter());
        System.out.printf("R2 Area: %.2f\n", r2.calculateArea());
        System.out.printf("R2 Perimeter: %.2f\n", r2.calculatePerimeter());
        System.out.println();
    }
}
