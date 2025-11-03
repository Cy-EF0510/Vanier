import java.util.*;
import java.util.function.*;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 45000),
            new Employee("Charlie", 25, 60000)
        );

        //Predicate: Employees with salary > 48000
        Predicate<Employee> highSalary = e -> e.getSalary() > //Predicate basically returns a boolean value, so it checks if something is higher than 48000
        48000;

        //Function: Extract employee name
        Function<Employee, String> getName = Employee::getName;

        //Consumer: Print employee details
        Consumer<Employee> printEmp = e -> //Consumer is a function that returns no value (void)
         System.out.println(e.getName() + ": $" + e.getSalary());
        
        System.out.println("high-Salary Employee Name");
        employees.stream()
                .filter(highSalary)
                .map(getName)
                .forEach(System.out::println);
        
        System.out.println("\nAll Employees:");
        employees.forEach(printEmp);
    }
}
