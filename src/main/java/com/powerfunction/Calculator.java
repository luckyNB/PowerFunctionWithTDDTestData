package com.powerfunction;


public class Calculator {
    public long calculate(int baseValue, int exponentValue) {
        long resultValue = 1;
        for (int i = 1; i <= exponentValue; i++) {
            resultValue *= baseValue;
        }
        System.out.println(resultValue);
        return resultValue;
    }
}
