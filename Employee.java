/public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Employee: %s %s\nSocial Security Number: %s",
                firstName, lastName, socialSecurityNumber);
    }
}