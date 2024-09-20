package com.example.lerijava;

public class Calculator {
    public int division(int num1, int num2) throws Exception{

        if (num2 == 0) throw new Exception("\"number 2\" can not be zero (0)");
        return num1/num2;
    }
}
