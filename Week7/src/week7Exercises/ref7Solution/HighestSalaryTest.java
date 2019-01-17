package week7Exercises.ref7Solution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HighestSalaryTest {

    private List<Employee> employees = Arrays.asList(new Employee("Mahnaz",3000,"AT123456789","ErsteBank"),
            new Employee("Amin",3500,"AT234876295629","Thales"));

    @Test
    void testGetHighestSalary() {
        HighestSalary highestSalary = new HighestSalary();
        Employee employee= highestSalary.getHighestSalary(employees);
        Integer hightSalaryExcepted = 3500;
        assertEquals(hightSalaryExcepted,employee.getSalary());
    }

}
