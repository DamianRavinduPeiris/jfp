package com.damian.jfp.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        var numbersList = new ArrayList<Integer>();
        numbersList.add(100);
        numbersList.add(141);
        Predicate<Integer> isOdd = (Integer i) -> i%2!=0;
        numbersList.forEach(n->{
            if(isOdd.test(n)){
                System.out.println(n +" is Odd!");
            }else{
                System.out.println(n+" is Even!");
            }
        });
    }
}