public class Rectangleclass {
    double length;
    double width;
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public boolean isSquare() {
        return length == width;
    }
    public void displayInfo() {
        System.out.println("===== RECTANGLE INFO =====");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
        System.out.println("Is Square: " + (isSquare() ? "Yes" : "No"));
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        Rectangleclass rect = new Rectangleclass();
        rect.length = 10.0;
        rect.width = 5.0;
        
        rect.displayInfo();
    }
}
