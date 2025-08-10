package collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveHighSalaryEx9 {
	public static void main(String[] args) {
        CopyOnWriteArrayList<Employee> employees = new CopyOnWriteArrayList<>();
        employees.add(new Employee("E1", "John", 30, 90000));
        employees.add(new Employee("E2", "Alice", 28, 75000));
        employees.add(new Employee("E3", "Bob", 35, 82000));

        for (Employee e : employees) {
            if (e.getEmpSalary() > 80000) {
                employees.remove(e);
            }
        }

        employees.forEach(System.out::println);
    }
}
