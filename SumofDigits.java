import java.util.Scanner;
class SumofDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            int digit =num%10;
            sum+=i;
            num=num/10;
        }
        System.out.println("Sum of digits is: "+sum);
}}