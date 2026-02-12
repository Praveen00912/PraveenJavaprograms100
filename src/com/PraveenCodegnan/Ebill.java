import java.util.Scanner;

public class Ebill{

 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter units consumed: ");
 int units = sc.nextInt();
 double bill = 0;
        
 if (units <= 100) {
 bill = units * 5.0;
 } else {
          if (units <= 200) {
                bill = (100 * 5.0) + ((units - 100) * 7.0);
            } else {
                bill = (100 * 5.0) + (100 * 7.0) + ((units - 200) * 10.0);
            }
        }
        
        System.out.printf("Total Bill: Rs. %.2f%n", bill);
        sc.close();
    }
}
