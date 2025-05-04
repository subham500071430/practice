package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProb {
    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Subham",1000));
        list.add(new Employee(2,"Prakash",2000));
        list.add(new Employee(3,"Sudeep",3000));
        list.add(new Employee(4,"Ankit",1500));

        Optional<Employee> find = list.stream()
                                  .sorted().skip(1)
                                  .findFirst();

        if(!find.isEmpty()){
            System.out.println(find.get().name);
        }
    }
}

class Employee implements Comparable<Employee>{

    int emp_id;
    String name;
    int salary;


    Employee(int emp_id,String name,int salary){
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {

        if(this.salary < o.salary){
            return -1;
        }else{
            return 1;
        }
    }
}

