//-> Given a list of objects of following class:
//
//           class Employee{
//           String fullName;
//           Long salary;
//           String city;
//           }
//
//          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//          Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }


    public String getFullName() {
        return fullName;
    }


    public Long getSalary() {
        return salary;
    }


    public String getCity() {
        return city;
    }
}

public class Question3b {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Amit Kumar Singh", 4000L, "delhi"),
                new Employee("Rohan Sharma", 6000L, "mumbai"),
                new Employee("Suresh Verma", 4500L, "delhi"),
                new Employee("Amit Gupta", 3000L, "delhi"),
                new Employee("Rohan Sharma", 3500L, "delhi"),
                new Employee("Sunil Kumar", 5000L, "delhi")
        );


        Set<String> uniqueFirstNames = employees.stream()
                .filter(emp -> emp.getSalary() < 5000 && "delhi".equalsIgnoreCase(emp.getCity()))
                .map(emp -> emp.getFullName().split(" ")[0])
                .collect(Collectors.toSet());

        System.out.println("Unique First Names are " + uniqueFirstNames);
    }
}

