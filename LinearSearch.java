import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 25, 30, 45, 50};
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();
        
        int index = linearSearch(arr, key);
        
        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }    
        scanner.close();
    } 
    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            } else {
                // continue searching
            }
        }
        return -1;
    }
}