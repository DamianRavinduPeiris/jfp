package com.damian.jfp.functional;

import java.util.function.Function;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        //Imagine we have 2 companies, which uses 2 approaches to generate employee ID.

        //Company 1.
        Employee e1 = new Employee();
        e1.setEmployeeName("Damian Peiris.");
        setID(e1, e -> e1.getEmployeeName().trim().replaceAll(" ", "").toLowerCase() + "@wiley.com");

        //Company 2.
        Employee e2 = new Employee();
        e2.setEmployeeName("Ravindu Peiris");
        setID(e2, e -> e2.getEmployeeName().replaceAll(" ", "").toLowerCase() + "@microsoft.com");
    }


    public static void setID(Employee employee, Function<Employee, String> employeeStringFunction) {
        employee.setEmployeeId(employeeStringFunction.apply(employee));
        logger.info("Employee ID: " + employee.getEmployeeId());


    }
}
