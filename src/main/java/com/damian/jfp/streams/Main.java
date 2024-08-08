package com.damian.jfp.streams;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        var numbersList = Arrays.asList(1, 22, 1111, 11);

        numbersList.stream().sorted().forEach(n -> logger.info(n + " is sorted!"));

        numbersList.stream().filter(n -> n % 2 == 0).forEach(n -> logger.info(n + " is Even!"));

        numbersList.stream().filter(n -> n % 2 != 0).forEach(n -> logger.info(n + " is Odd!"));
    }
}
