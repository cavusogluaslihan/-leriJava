package com.example.lerijava;

public class TryCatchMain {
    public static void main(String args[]) {

       /* int x=5;
        int y=1;

        int [] array = new int [2];

        try {
            System.out.println("Result : "+ (x/y));
            System.out.println("Mission accomplished");
            array[4] = 8;

        } catch (Exception e){
           // e.printStackTrace();

            if (e instanceof ArithmeticException){
                System.out.println("\"y\" can not be zero (0)");
            }
            if (e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("The length of the array is not enough! ");
            }
        }

    }*/

        int x = 5;
        int y = 1;

        int[] array = new int[2];

        try {
            System.out.println("Result : " + (x / y));
            System.out.println("Mission accomplished");
            array[4] = 8;

        } catch (ArithmeticException e) {
            System.out.println("\"y\" can not be zero (0)");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The length of the array is not enough! ");
        }
    }
}
