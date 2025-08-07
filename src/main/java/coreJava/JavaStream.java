package coreJava;

import java.util.ArrayList;
import java.util.List;

public class JavaStream {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, 100));
        list.add(new Employee(2, 200));
        list.add(new Employee(3, 300));

        List<Employee> res = list.stream()
                .map(employee -> new Employee(employee.empId, 1.1 * employee.salary))
                .toList();

        res.forEach(employee -> System.out.println(employee.salary));

    }
}

class Employee {

    int empId;
    double salary;

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }
}

