import java.util.Scanner;
class RectangleCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length: ");
        double len=sc.nextDouble();
        System.out.print("Enter Width: ");
        double wid=sc.nextDouble();
        double area= len*wid;
        double perimeter= 2*(len+wid);
        System.out.printf("The area is: %.2f square units%n", area);
        System.out.printf("The perimeter is: %.2f units%n", perimeter);
    }
    
}