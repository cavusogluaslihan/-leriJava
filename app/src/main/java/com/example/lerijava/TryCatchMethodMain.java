package com.example.lerijava;

import com.google.android.material.shape.ShapePath;

import java.util.Scanner;

public class TryCatchMethodMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = scanner.nextInt();

        Calculator newNum = new Calculator();
        try {
            newNum.division(num1,num2);
        } catch (Exception e) {
           System.out.println(" \"number 2\" can not be zero (0)");
        }


    }
}
