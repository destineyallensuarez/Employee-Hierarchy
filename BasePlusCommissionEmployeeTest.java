public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // Create a BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
            "John", "Doe", "123-45-6789", 5000, 0.05, 1000);

        // Display the employee information
        System.out.println("Employee Information:");
        System.out.println(employee);

        // Test the setter methods
        System.out.println("\nUpdating employee information...");
        employee.setGrossSales(6000);
        employee.setCommissionRate(0.06);
        employee.setBaseSalary(1200);

        // Display the updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println(employee);
    }
}