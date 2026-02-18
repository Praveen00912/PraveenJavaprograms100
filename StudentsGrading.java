import java.util.Scanner;
public class StudentsGrading {
    static Scanner sc = new Scanner(System.in);
    static void inputData(String[] names, int[] totalmarks, double[] percentages, char[] grades){
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks of subject 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter marks of subject 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter marks of subject 3: ");
            int m3 = sc.nextInt();
            sc.nextLine();
            totalmarks[i] = m1 + m2 + m3;
            percentages[i] = totalmarks[i] / 3.0;
            grades[i] = Grade(percentages[i]);
        }
    }
    static char Grade(double percentage){
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else
            return 'F';
    }
    static double calculateClassAverage(double[] percentages){
        double sum = 0;
        for (double p : percentages) {
            sum += p;
        }
        return sum / percentages.length;
    }
    static void displayReport(String[] names, int[] totalmarks,
                              double[] percentages, char[] grades){

        System.out.println("\n===== CLASS PERFORMANCE REPORT =====");
        System.out.printf("%-15s %-12s %-12s %-8s\n", "Name", "Total", "Percentage", "Grade");
    }
    public static void main(String[] args){
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        int[] totalmarks = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        inputData(names, totalmarks, percentages, grades);
        double classAverage = calculateClassAverage(percentages);
        displayReport(names, totalmarks, percentages, grades);
        System.out.printf("\nClass Average Percentage: %.2f\n", classAverage);
        sc.close();
    }
}