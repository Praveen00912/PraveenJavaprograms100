import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Current year: ");
        int CurrentYear=sc.nextInt();
        System.out.print("Enter your Birth year: ");
        int BirthYear=sc.nextInt();
        int age= CurrentYear - BirthYear;
        System.out.println("Your Age is: "+age);
        sc.close();

    }
}
