import java.util.Scanner;

public class AllPracticePrograms {

    // Prime check function
    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Factorial");
            System.out.println("2. Sum of digits");
            System.out.println("3. Reverse number");
            System.out.println("4. Count odd digits");
            System.out.println("5. Sum of even digits");
            System.out.println("6. Check palindrome");
            System.out.println("7. Check Armstrong");
            System.out.println("8. Prime check");
            System.out.println("9. Factors");
            System.out.println("10. HCF and LCM");
            System.out.println("11. Array sum");
            System.out.println("12. Linear search");
            System.out.println("13. Reverse array");
            System.out.println("14. Count even numbers in array");
            System.out.println("15. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Factorial
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();

                    int fact = 1;

                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }

                    System.out.println("Factorial = " + fact);
                    break;

                case 2:
                    // Sum of digits
                    System.out.print("Enter number: ");
                    n = Math.abs(sc.nextInt());

                    int sum = 0;

                    while (n > 0) {
                        sum += n % 10;
                        n /= 10;
                    }

                    System.out.println("Sum of digits = " + sum);
                    break;

                case 3:
                    // Reverse number
                    System.out.print("Enter number: ");
                    n = sc.nextInt();

                    int rev = 0;

                    while (n > 0) {
                        rev = rev * 10 + n % 10;
                        n /= 10;
                    }

                    System.out.println("Reverse = " + rev);
                    break;

                case 4:
                    // Count odd digits
                    System.out.print("Enter number: ");
                    n = Math.abs(sc.nextInt());

                    int count = 0;

                    while (n > 0) {
                        int digit = n % 10;

                        if (digit % 2 == 1)
                            count++;

                        n /= 10;
                    }

                    System.out.println("Odd digits count = " + count);
                    break;

                case 5:
                    // Sum of even digits
                    System.out.print("Enter number: ");
                    n = Math.abs(sc.nextInt());

                    sum = 0;

                    while (n > 0) {
                        int digit = n % 10;

                        if (digit % 2 == 0)
                            sum += digit;

                        n /= 10;
                    }

                    System.out.println("Even digits sum = " + sum);
                    break;

                case 6:
                    // Palindrome
                    System.out.print("Enter number: ");
                    n = sc.nextInt();

                    int original = n;
                    rev = 0;

                    while (n > 0) {
                        rev = rev * 10 + n % 10;
                        n /= 10;
                    }

                    if (original == rev)
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");

                    break;

                case 7:
                    // Armstrong
                    System.out.print("Enter number: ");
                    n = sc.nextInt();

                    original = n;
                    sum = 0;

                    while (n > 0) {
                        int digit = n % 10;
                        sum += digit * digit * digit;
                        n /= 10;
                    }

                    if (sum == original)
                        System.out.println("Armstrong number");
                    else
                        System.out.println("Not Armstrong");

                    break;

                case 8:
                    // Prime check
                    System.out.print("Enter number: ");
                    n = sc.nextInt();

                    if (isPrime(n))
                        System.out.println("Prime number");
                    else
                        System.out.println("Not prime");

                    break;

                case 9:
                    // Factors
                    System.out.print("Enter number: ");
                    n = sc.nextInt();

                    System.out.println("Factors:");

                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0)
                            System.out.print(i + " ");
                    }

                    break;

                case 10:
                    // HCF and LCM
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();

                    int x = a, y = b;

                    while (x != y) {
                        if (x > y)
                            x = x - y;
                        else
                            y = y - x;
                    }

                    int hcf = x;
                    int lcm = (a * b) / hcf;

                    System.out.println("HCF = " + hcf);
                    System.out.println("LCM = " + lcm);

                    break;

                case 11:
                    // Array sum
                    int[] arr = {3, 5, 7};

                    sum = 0;

                    for (int i = 0; i < arr.length; i++)
                        sum += arr[i];

                    System.out.println("Array sum = " + sum);
                    break;

                case 12:
                    // Linear search
                    int[] arr2 = {2, 4, 7, 1, 9};

                    System.out.print("Enter number to search: ");
                    int key = sc.nextInt();

                    int index = -1;

                    for (int i = 0; i < arr2.length; i++) {

                        if (arr2[i] == key) {
                            index = i;
                            break;
                        }
                    }

                    System.out.println("Index = " + index);
                    break;

                case 13:
                    // Reverse array
                    int[] arr3 = {1, 2, 3, 4};

                    int start = 0;
                    int end = arr3.length - 1;

                    while (start < end) {

                        int temp = arr3[start];
                        arr3[start] = arr3[end];
                        arr3[end] = temp;

                        start++;
                        end--;
                    }

                    System.out.println("Reversed array:");

                    for (int num : arr3)
                        System.out.print(num + " ");

                    break;

                case 14:
                    // Count even numbers
                    int[] arr4 = {1, 2, 3, 4, 5, 6};

                    count = 0;

                    for (int num : arr4) {

                        if (num % 2 == 0)
                            count++;
                    }

                    System.out.println("Even numbers count = " + count);
                    break;

                case 15:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
