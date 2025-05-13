package org.example;

// Single Responsibility Principle
// A class should be responsible for only one thing or should have only one job to do
// Voilates SRP principle
import java.util.List;

public class SRP {

    public static void main(String[] args) {

           EmployeeVSRP newEmployee = new EmployeeVSRP(1,"Subham");
           newEmployee.saveToDB(newEmployee);

           // now if I want to change the logic to save data in the db . I will
           // have to change Employee class which will be very complex in real world
          // so this code voilates SRP principle as Employee is also responsible to save
          // data in the database.

        EmployeeSRP employeeSRP = new EmployeeSRP(1,"Subham");
        SaveData saveData = new SaveData();
        saveData.saveToDB(employeeSRP);

        // this follows SRP principle
    }
}

class EmployeeVSRP {

    private final int emp_id;
    private final String emp_name;

    EmployeeVSRP(int emp_id,String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public String getEmployeeDetails(){
           return "name : " + this.emp_name + " employee id : " + this.emp_id;
    }

    public boolean saveToDB(EmployeeVSRP employeeVSRP){

           if(employeeVSRP!=null){
               System.out.println("Saved Employee Record to DB");
               return true;
           }

           return false;
    }

}
// This is following SRP principle

class EmployeeSRP {

    private final int emp_id;
    private final String emp_name;

    EmployeeSRP(int emp_id,String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public String getEmployeeDetails(){
           return "name : " + this.emp_name + " employee id : " + this.emp_id;
    }

}

class SaveData{

    public boolean saveToDB(EmployeeSRP employeeSRP){

        if(employeeSRP!=null){
            System.out.println("Saved Employee Record to DB");
            return true;
        }

        return false;
    }
}
