import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Employee, Integer> employeeMap = new HashMap<>();
        Map<OverridingEmployee, Integer> overEmployeeMap = new HashMap<>();

        Employee employee1 = new Employee(1, "Java", "Core", "java@core.com");
        Employee employee2 = new Employee(1, "Java", "Core", "java@core.com");
        employeeMap.put(employee1, 1);
        employeeMap.put(employee2, 2);

        System.out.println("\n-----------------------------------------------------------------------------------------");

        System.out.println("employee1.hashCode() : " + employee1.hashCode()
                + " | employee2.hashCode() : " + employee2.hashCode()); // employee1 = 1531448569 | employee2 = 1867083167
        System.out.println("employee1 == employee2 : " + employee1.equals(employee2)); // false

        System.out.println("employeeMap.size() : " + employeeMap.size()); // 2

        System.out.println("-----------------------------------------------------------------------------------------\n\n");

        OverridingEmployee employee3 = new OverridingEmployee(1, "Java", "Core", "java@core.com");
        OverridingEmployee employee4 = new OverridingEmployee(1, "Java", "Core", "java@core.com");
        System.out.println("-----------------------------------------------------------------------------------------");
        overEmployeeMap.put(employee3, 1); // employee3.hashCode() = 1523057875
        System.out.println("-----------------------------------------------------------------------------------------");
        overEmployeeMap.put(employee4, 2); // employee4.hashCode() = 1523057875
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("overEmployeeMap.size() : " + overEmployeeMap.size()); // 1


    }
}