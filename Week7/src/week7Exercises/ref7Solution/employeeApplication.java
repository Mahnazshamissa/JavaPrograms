package week7Exercises.ref7Solution;

import java.util.List;

public class employeeApplication {
    public static void main(String[] args) {
        EmployeeReader employeeReader = new EmployeeReader();
        List<Employee> employees = employeeReader.getEmployees("/home/fatemeh/IdeaProjects/Week7/src/week7Exercises/ref7Solution/employees.csv");
        Bank bank = new Bank();
        List<String> transfer = bank.transferList(employees);
        bank.display(transfer);

        TotalAmount totalAmount = new TotalAmount();
        System.out.println("Total amount paid: " + totalAmount.getAmount(employees));

        DepartmentMostPays departmentMostPays = new DepartmentMostPays();
        System.out.println("Most paying department: " + departmentMostPays.getDepartmentMostPay(employees));

        HighestSalary highestSalary = new HighestSalary();
        System.out.println(highestSalary.getHighestSalary(employees));

    }
}
