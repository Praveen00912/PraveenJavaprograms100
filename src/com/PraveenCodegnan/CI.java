import java.util.Scanner;
class CI{
// Compound Interest Calculator
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Rate(%): ");
double r=sc.nextDouble();
System.out.print("Enter Principle(Rs): ");
double p=sc.nextDouble();
System.out.print("Enter Time(yr): ");
double t=sc.nextDouble();
double a=p*Math.pow(1 + r/100.0,t);
double CI= a-p;
System.out.printf("The CI: Rs. %.2f%n",CI);
System.out.printf("The Amount: Rs. %.2f",a);
sc.close();
}}