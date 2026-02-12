import java.util.Scanner;

class Celsius{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("1. Cel to fahre..");
System.out.println("2. Fahre.. to Cel");
System.out.print("Chose anyone: ");
int Choice= sc.nextInt();
if(Choice ==1){
System.out.print("Enter Cel: ");
float cel=sc.nextFloat();
float fah = (cel * 9.0f / 5.0f) + 32.0f;
System.out.printf("%.2f C= %.2f F", cel, fah);
} else{
if(Choice ==2){
System.out.print("Enter Fah: ");
float fah=sc.nextFloat();
float cel = (fah - 32) * 5.0f / 9.0f;
System.out.printf("%.2f F= %.2f C", fah, cel);
} 
else{
System.out.println("Invalid choice");
}
}
sc.close();
}
}