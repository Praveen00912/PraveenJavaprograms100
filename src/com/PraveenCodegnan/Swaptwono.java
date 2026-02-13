import java.util.Scanner;
class SwapTwono{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter value of a: ");
int a = sc.nextInt();
System.out.print("Enter value of b: ");
int b = sc.nextInt();
System.out.println("Before Swapping a value is: "+ a +" & b value is: "+b);

a=a+b;
b=a-b;
a=a-b;

System.out.println("After Swapping a value is: "+ a +" & b value is: "+b);
sc.close();
}}
