import java.util.Scanner;
class CircleArea{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
final double PI=3.14;
System.out.print("Enter the radius: ");
float r= sc.nextFloat();
double area= PI*r*r;
double circum= 2*PI*r;
System.out.printf("Area of Circle is: %.2f%n", area);
System.out.printf("Circumference of Circle is: %.2f%n", circum);
sc.close();
}}