import java.util.Objects;

public class OverridingEmployee {

    private int employeeId;
    private String employeeName;
    private String employeeSurname;
    private String employeeEmail;

    public OverridingEmployee() {
    }

    public OverridingEmployee(int employeeId, String employeeName, String employeeSurname, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeeEmail = employeeEmail;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals() Method Works!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OverridingEmployee that = (OverridingEmployee) o;
        return employeeId == that.employeeId && Objects.equals(employeeName, that.employeeName) && Objects.equals(employeeSurname, that.employeeSurname) && Objects.equals(employeeEmail, that.employeeEmail);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() Method Works!");
        return Objects.hash(employeeId, employeeName, employeeSurname, employeeEmail);
    }
}
