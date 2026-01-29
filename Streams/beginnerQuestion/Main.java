package Streams.beginnerQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1L, "vivek", 20.00);
        Employee e2 = new Employee(2L, "vanshi", 10.00);
        Employee e3 = new Employee(3L, "sandhya", 50.00);
        Employee e4 = new Employee(4L, "rathore", 30.00);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        // 👉 Now you can directly practice Stream logic here
        // Example: print employees with salary > 20
       

        System.out.println("- Filter by Salary");

        employees.stream()
        .filter(e -> e.getSalary() >=  20)
        .forEach(System.out :: println);



        System.out.println("- Sort by Salary");

        employees.stream().sorted(Comparator.comparing(Employee :: getSalary)).forEach(System.out::println);

        // count the employee who salary  > 25.00

        System.out.println("Salary > 25.00 ==> " + 
        employees.stream()
                 .filter(e -> e.getSalary() >= 25.00)
                 .count());


        // Find First Employee
        // Find the first employee whose name starts with


        System.out.println("- employee whose name starts with v :- ");
        
        employees.stream().filter(e -> e.getName().startsWith("v")).forEach(System.out :: println);




    }
}

// Separate Employee class
class Employee {
    private Long id;
    private String name;
    private double salary;

    // Constructor
    public Employee(Long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // toString for easy printing
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}