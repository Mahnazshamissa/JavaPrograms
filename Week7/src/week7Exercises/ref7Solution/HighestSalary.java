package week7Exercises.ref7Solution;

import java.util.List;

public class HighestSalary {
    DepartmentMostPays departmentMostPays = new DepartmentMostPays();


    public Employee getHighestSalary(List<Employee> employees) {

        List<Employee> employeeList = departmentMostPays.getListOFhightSalary(employees);
        Employee employee = employeeList.get(0);

        return employee;
    }
}
