package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String name = myScanner.nextLine();

        System.out.println("How many hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.println("Enter pay rate: ");
        double payRate = myScanner.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println("Employee name: " + name);
        System.out.println("Gross pay: $" + grossPay);

    }
}
