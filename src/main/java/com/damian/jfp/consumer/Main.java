package com.damian.jfp.consumer;

import com.damian.jfp.functional.Employee;

import java.util.function.Consumer;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(com.damian.jfp.supplier.Main.class.getName());

    public static void main(String[] args) {

        //Purpose: It represents a function that consumes a value, performing some operation on the given input without returning any result.
        //Method: It has a single method void accept(T t) that takes an input of type T and returns no result.

        Employee e1 = new Employee("E001", "Damian Peiris");
        logEmployeeDetails(e1, e -> logger.info(e.toString()));

    }

    public static void logEmployeeDetails(Employee e, Consumer<Employee> employeeConsumer) {
        employeeConsumer.accept(e);

    }
}
