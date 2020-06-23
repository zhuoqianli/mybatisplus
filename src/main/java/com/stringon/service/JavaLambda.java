package com.stringon.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaLambda {
    public static void main(String[] args) {
        Runnable am_lambda = () -> System.out.println("i am lambda");
        am_lambda.run();
        List<String> strings = Arrays.asList("I", "am", "lambda", "I");
        Collections.sort(strings, (s1, s2) ->{
            if (s1 == null) {
                return -1;
            }
            if (s2 == null) {
                return 1;
            }
            return s1.length() - s2.length();
        });
        System.out.println(strings);
    }
}
