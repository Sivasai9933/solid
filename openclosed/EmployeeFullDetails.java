package harshitSolid.openclosed;

public class EmployeeFullDetails extends Employee{
    private int employeeMobileNumber;
    private String employeePersonalEmail;

    public EmployeeFullDetails(String employeeId, float employeeSalary,int employeeMobileNumber, String employeePersonalEmail) {
        super(employeeId, employeeSalary);
        this.employeeMobileNumber = employeeMobileNumber;
        this.employeePersonalEmail = employeePersonalEmail;
    }


    public int getEmployeeMobileNumber() {
        return this.employeeMobileNumber;
    }

    public void setEmployeeMobileNumber(int employeeMobileNumber) {
        this.employeeMobileNumber = employeeMobileNumber;
    }

    public String getEmployeePersonalEmail() {
        return this.employeePersonalEmail;
    }

    public void setEmployeePersonalEmail(String employeePersonalEmail) {
        this.employeePersonalEmail = employeePersonalEmail;
    }

    
}
