package org.example;

import java.util.*;

public class EmployeeProb {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Subham",1000));
        list.add(new Employee(2,"Prakash",2000));
        list.add(new Employee(3,"Sudeep",3000));
        list.add(new Employee(4,"Ankit",1500));
        list.add(new Employee(5,"Amandeep",2800));

        Comparator<Employee> comp = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.salary - o1.salary;
            }
        };

        Optional<Employee> find = list.stream()
                                  .sorted(comp).skip(1)
                                  .findFirst();

        if(!find.isEmpty()){
            System.out.println(find.get().name);
        }
    }
}

class Employee {

    int emp_id;
    String name;
    int salary;


    Employee(int emp_id,String name,int salary){
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

}

