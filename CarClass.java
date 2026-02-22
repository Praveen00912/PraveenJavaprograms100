public class CarClass {
    
    String brand;
    String model;
    int year;
    double price;
    
    public void displayInfo() {
        System.out.println("===== CAR INFO =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.printf("Price: Rs. %.2f%n", price);
        System.out.println("====================");
    }
    
    public int calculateAge() {
        return 2024 - year;
    }
    
    public void applyDiscount(double percentage) {
        double discount = price * (percentage / 100.0);
        price -= discount;
        System.out.printf("Discount Applied: %.2f%%%n", percentage);
        System.out.printf("New Price: Rs. %.2f%n", price);
    }
    
    public static void main(String[] args) {
        CarClass car = new CarClass();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2020;
        car.price = 2500000.00;
        
        car.displayInfo();
        System.out.println("Age: " + car.calculateAge() + " years");
        car.applyDiscount(10);
    }
}
