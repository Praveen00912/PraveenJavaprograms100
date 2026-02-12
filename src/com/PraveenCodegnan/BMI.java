import java.util.Scanner;
class BMI{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//BMI = wight / height*height

System.out.print("Your Weight(Kg): ");
float w= sc.nextFloat();
System.out.print("Your Height(m): ");
float h= sc.nextFloat();

float BMI= w/(h*h);
System.out.print("Your BMI is: "+BMI);
sc.close();
}
}