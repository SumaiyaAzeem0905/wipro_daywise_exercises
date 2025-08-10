package anonymous;


import java.util.*;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) { this.name = name; this.salary = salary; }
    public String toString() { return name + " - " + salary; }
}
public class ComparatoeEx11 {
	public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A", 5000),
            new Employee("B", 9000),
            new Employee("C", 7000)
        );
        list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        list.forEach(System.out::println);
    }
}
