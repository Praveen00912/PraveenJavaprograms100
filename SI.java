import java.util.Scanner;
class SI{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle(Rs): ");
        double p=sc.nextDouble();
        System.out.print("Enter Rate(%): ");
        double r=sc.nextDouble();
        System.out.print("Enter Time(yrs): ");
        double t=sc.nextDouble();
        double SI= (p*r*t)/100.0;
        System.out.println("The Amount is : Rs. "+ SI);
        double a= SI + p;
        System.out.println("SI is : Rs. "+ a);
        sc.close();

    }
}
