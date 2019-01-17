package week7Exercises.reflection7;

import java.util.Arrays;
import java.util.List;

public class Splitor {
    public List<String> split(String input) {
        String[] line = input.split(";");
        return Arrays.asList(line);
    }


  /*  public Employee getEmployee(String line) {
        String[] part = line.split(";");
        List<String> parts = Arrays.asList(part);
        String name = parts.get(0);
        String department = parts.get(1);
        String salaryString = parts.get(2);
        Integer salary = Integer.valueOf(salaryString);
        String bankAcount = parts.get(3);
        Employee employee = new Employee(name, salary, bankAcount, department);
        return employee;
    }*/
}
