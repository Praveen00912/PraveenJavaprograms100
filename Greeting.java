import java.util.Scanner;
class Greeting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you First Name: ");
        String firstName=sc.nextLine();
        System.out.print("Enter you First Name: ");
        String lastName=sc.nextLine();
        System.out.printf("Hello, %s %s ! Welcome to Codegnan Java Programming !"
        ,firstName,lastName);
        sc.close();
    }
}