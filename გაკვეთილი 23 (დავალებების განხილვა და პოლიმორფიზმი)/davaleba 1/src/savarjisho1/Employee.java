package savarjisho1;

public class Employee extends Human{
    private String employeeId;

    public Employee(String firstName, String lastName, int age, String employeeId) {
        super(firstName, lastName, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}