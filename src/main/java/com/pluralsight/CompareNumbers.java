package com.pluralsight;

import java.awt.color.ICC_ColorSpace;

public class CompareNumbers {
    public static void main(String[] args) {

        //try with 5,should be
        System.out.println("70 is even: " + isEven(70));

        // try with 2, should be false
        System.out.println("-40 is positive: " + isPositive(-40));
    }

    public static boolean isEven(int numbers) {
        if (numbers % 2 == 0) {
            return true;
        }
        return false;

    }

    public static boolean isPositive(int numbers) {
        if (numbers > 0) {
            return true;
        }
        return false;

    }


}