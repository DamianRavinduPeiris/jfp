package com.damian.jfp.supplier;

import com.damian.jfp.functional.Employee;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // If we have some operation which is costly , we can use the supplier function.
        //It does not get evaluated until we call the get() method.
        Employee e1 = new Employee();
        e1.setEmployeeName("Damian Peiris.");
        createAccount(e1,()->"An error occurred while creating the account : "+ LocalDateTime.now());

        Employee e2 = new Employee();
        e2.setEmployeeName("");
        createAccount(e2,()->"An error occurred while creating the account : "+ LocalDateTime.now());
    }

    public static void createAccount(Employee employee, Supplier<String> errorMsg) {

        if (employee.getEmployeeName().isEmpty()) {
            logger.warning(errorMsg.get());
        } else {
            logger.info("Account created successfully for " + employee.getEmployeeName());
        }

    }

}
