package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBySalaryEx7 {
	 public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	                new Employee("E1", "John", 30, 90000),
	                new Employee("E2", "Alice", 28, 75000),
	                new Employee("E3", "Bob", 35, 82000)
	        );

	        employees.sort(Comparator.comparing(Employee::getEmpSalary).reversed());
	        employees.forEach(System.out::println);
	    }
}
