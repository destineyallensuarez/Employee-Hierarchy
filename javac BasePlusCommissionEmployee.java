public class javaBasePlusCommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales       
    private double commissionRate; // commission percentage
    private double baseSalary; // base salary per week
 
    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, 
       String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
       super(firstName, lastName, socialSecurityNumber);
 
       if (grossSales < 0.0) {
          throw new IllegalArgumentException(
             "Gross sales must be >= 0.0");
       }
 
       if (commissionRate <= 0.0 || commissionRate >= 1.0) {
          throw new IllegalArgumentException(
             "Commission rate must be > 0.0 and < 1.0");
       }
 
       if (baseSalary < 0.0) {
          throw new IllegalArgumentException(
             "Base salary must be >= 0.0");
       }
 
       this.grossSales = grossSales;
       this.commissionRate = commissionRate;
       this.baseSalary = baseSalary;
    } 
 
    // set gross sales amount
    public void setGrossSales(double grossSales) {
       if (grossSales < 0.0) {
          throw new IllegalArgumentException(
             "Gross sales must be >= 0.0");
       }
 
       this.grossSales = grossSales;
    } 
 
    // return gross sales amount
    public double getGrossSales() {
       return grossSales;
    } 
 
    // set commission rate
    public void setCommissionRate(double commissionRate) {
       if (commissionRate <= 0.0 || commissionRate >= 1.0) {
          throw new IllegalArgumentException(
             "Commission rate must be > 0.0 and < 1.0");
       }
 
       this.commissionRate = commissionRate;
    } 
 
    // return commission rate
    public double getCommissionRate() {
       return commissionRate;
    }
 
    // set base salary
    public void setBaseSalary(double baseSalary) {
       if (baseSalary < 0.0) {
          throw new IllegalArgumentException(
             "Base salary must be >= 0.0");
       }
 
       this.baseSalary = baseSalary;
    }
 
    // return base salary
    public double getBaseSalary() {
       return baseSalary;
    }
 
    // calculate earnings
    public double earnings() {
       return getBaseSalary() + (getCommissionRate() * getGrossSales());
    } 
 
    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
       return String.format("%s\n%s: %.2f%n%s: %.2f%n%s: %.2f",
          super.toString(), "Gross Sales", getGrossSales(),
          "Commission Rate", getCommissionRate(), 
          "Base Salary", getBaseSalary());
    } 
 }