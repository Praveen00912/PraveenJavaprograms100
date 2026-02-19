public class Employeeclass {
    
    String name;
    int employeeId;
    double monthlySalary;
    String department;
    
    public void displayInfo() {
        System.out.println("===== EMPLOYEE INFO =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.printf("Monthly Salary: Rs. %.2f%n", monthlySalary);
        System.out.println("Department: " + department);
        System.out.println("=========================");
    }
    
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
    
    public static void main(String[] args) {
        Employeeclass emp = new Employeeclass();
        emp.name = "Rajesh Kumar";
        emp.employeeId = 1001;
        emp.monthlySalary = 50000.00;
        emp.department = "IT";
        
        emp.displayInfo();
        System.out.printf("Annual Salary: Rs. %.2f%n", 
                         emp.calculateAnnualSalary());
    }
}