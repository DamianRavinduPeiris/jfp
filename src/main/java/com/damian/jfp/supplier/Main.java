package com.damian.jfp.supplier;

import com.damian.jfp.functional.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // If we have some operation which is costly , we can use the supplier function.
        //It does not get evaluated until we call the get() method.

        //Purpose: It represents a function that supplies a value, typically used when you need to generate or provide an instance of something without taking any input.
        //Method: It has a single method T get() that returns an instance of type T.

        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setEmployeeId("E001");
        e1.setEmployeeName("Damian Peiris.");

        Employee e2 = new Employee();
        e2.setEmployeeId("E002");
        e2.setEmployeeName("");


        employeeList.add(e1);
        employeeList.add(e2);

        employeeList.forEach(e-> createAccount(e,()->"An error occurred while creating the account : "+ LocalDateTime.now()+" Employee ID : "+e.getEmployeeId()));

    }

    public static void createAccount(Employee employee, Supplier<String> errorMsg) {

        if (employee.getEmployeeName().isEmpty()) {
            logger.warning(errorMsg.get());
        } else {
            logger.info("Account created successfully for " + employee.getEmployeeName());
        }

    }

}
