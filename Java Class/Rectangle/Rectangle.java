/**
 * Hikaru Yamamoto
 * CS170
 * 04 23, 2020
 */

public class Rectangle{
    //Instance variables
    private double width;
    private double length;
    
    //Default constructor
    public Rectangle() {
        width = 0;
        length = 0;
    }
    
    //Overloaded constructor
    public Rectangle(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
    }
    
    //Method getWidth
    public double getWidth() {
        return width;
    }
    
    //Method getLength 
    public double getLength() {
        return length;
    }
    
    //Method setWidth
    public void setWidth(double newWidth) {
        width = newWidth;
    }
    
    //Method setLength
    public void setLength(double newLength) {
        length = newLength;
    }
    
    //Method calculateArea
    public double calculateArea() {
        double area = width * length;
        return area;
    }
    
    //calculatePerimeter 
    public double calculatePerimeter() {
        double perimeter = (width * 2) + (length * 2);
        return perimeter;
    }
    
    //printDimensions
    public void printDimensions() {
        System.out.printf("Width: %.2f\n", width);
        System.out.printf("Length: %.2f\n", length);
    }
}
