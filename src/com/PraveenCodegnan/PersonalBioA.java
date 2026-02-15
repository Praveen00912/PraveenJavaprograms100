import java.util.Scanner;

/**
 * Personal Bio CLI Application
 * 
 * A command-line interface application that collects user's
 * biographical information and displays it in a formatted manner.
 * 
 * Features:
 * - Interactive user prompts
 * - Multiple data types (String, int)
 * - Proper Scanner buffer management
 * - Professional output formatting
 * - Input validation ready
 * 
 * This demonstrates production-grade Java coding practices including:
 * - Comprehensive documentation
 * - Proper resource management
 * - Clean code structure
 * - User-friendly interface
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 * @since 2024
 */
public class PersonalBioA{
    
    /**
     * Main method - orchestrates the entire application flow.
     * 
     * Flow:
     * 1. Display welcome banner
     * 2. Collect user information
     * 3. Display formatted bio profile
     * 4. Show thank you message
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayWelcomeBanner();
        System.out.println("Please provide your information:");
        System.out.println();
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        System.out.print("Enter your highest qualification: ");
        String qualification = scanner.nextLine();
        System.out.print("Enter your current profession: ");
        String profession = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();
        displayBioProfile(fullName, age, city, qualification, 
                         profession, email, phone, hobby);
        displayThankYouMessage();
        scanner.close();
    }
    /**
     * Displays welcome banner with application title.
     * Provides professional first impression.
     */
    private static void displayWelcomeBanner() {
        System.out.println("=============================================");
        System.out.println("      PERSONAL BIOGRAPHICAL PROFILE         ");
        System.out.println("      CLI Application - Version 1.0         ");
        System.out.println("=============================================");
        System.out.println();
    }
    
    /**
     * Displays formatted biographical profile.
     * Uses printf for aligned, professional output.
     * 
     * @param fullName user's complete name
     * @param age user's age in years
     * @param city user's city of residence
     * @param qualification user's highest educational qualification
     * @param profession user's current profession/occupation
     * @param email user's email address
     * @param phone user's contact number
     * @param hobby user's favorite hobby
     */
    private static void displayBioProfile(String fullName, int age, 
                                         String city, String qualification,
                                         String profession, String email,
                                         String phone, String hobby) {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("         YOUR BIOGRAPHICAL PROFILE           ");
        System.out.println("=============================================");
        System.out.printf("%-20s : %s%n", "Full Name", fullName);
        System.out.printf("%-20s : %d years%n", "Age", age);
        System.out.printf("%-20s : %s%n", "City", city);
        System.out.printf("%-20s : %s%n", "Qualification", qualification);
        System.out.printf("%-20s : %s%n", "Profession", profession);
        System.out.printf("%-20s : %s%n", "Email", email);
        System.out.printf("%-20s : %s%n", "Phone", phone);
        System.out.printf("%-20s : %s%n", "Hobby", hobby);
        System.out.println("=============================================");
    }
    
    /**
     * Displays thank you message and application info.
     * Provides professional closing.
     */
    private static void displayThankYouMessage() {
        System.out.println();
        System.out.println("Thank you for using Personal Bio Application!");
        System.out.println("Your information has been recorded successfully.");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Package: com.Praveencodegnan");
        System.out.println("Developed by: Praveen Codegnan IT Solutions");
        System.out.println("=============================================");
    }
}
