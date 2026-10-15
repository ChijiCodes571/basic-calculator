package com.pluralsight;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = myScanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = myScanner.nextInt();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Select option: ");
        String option = myScanner.next();

        int result = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + result);


    }
}
