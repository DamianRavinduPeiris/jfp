package com.damian.jfp.predicate;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        var numbersList = new ArrayList<Integer>();
        numbersList.add(100);
        numbersList.add(141);

        Predicate<Integer> isOdd = (Integer i) -> i % 2 != 0;
        numbersList.forEach(n -> {
            if (isOdd.test(n)) {
                logger.info(n + " is Odd!");
            } else {
                logger.info(n + " is Even!");
            }
        });
        // For int we can use IntPredicate also.
        IntPredicate isOdd2 = (int i) -> i % 2 != 0;
        numbersList.forEach(n -> {
            if (isOdd2.test(n)) {
                logger.info(n + " is Odd!");
            } else {
                logger.info(n + " is Even!");
            }


        });
    }
}