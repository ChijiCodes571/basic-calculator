package com.pluralsight;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        String employeeName;
        employeeName = getName();

        int hoursWorked = getHoursWorked();

        double payRate = getPayRate();

        calcAndPrintPay(hoursWorked, payRate, employeeName);
    }

    private static void calcAndPrintPay(int hoursWorked, double payRate, String name) {
        double grossPay = hoursWorked * payRate;

        System.out.println("Employee name: " + name);
        System.out.println("Gross pay: $" + grossPay);
    }

    private static double getPayRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pay rate: ");
        return scanner.nextDouble();
    }

    private static int getHoursWorked() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours worked: ");
        return scanner.nextInt();
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        return scanner.nextLine();
    }
}

