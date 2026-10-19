package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //get the name
        String name = getName(myScanner);

        //get the hours worked
        double hoursWorked = getHoursWorked(myScanner);

        //get the pay rate
        double payRate = getPayRate(myScanner);

        //calculate gross pay
        double grossPay = calculateGrossPay(payRate, hoursWorked);

        //calculate ot
        double overTime = calculateOt(hoursWorked, payRate);

        //print gross pay and ot
        System.out.println("Yo, " + name + "your gross pay is " + grossPay + " and your overtime is " + overTime);


//        System.out.println("Enter employee name: ");
//        String name = myScanner.nextLine();
//
//        System.out.println("How many hours worked: ");
//        double hoursWorked = myScanner.nextDouble();
//
//        System.out.println("Enter pay rate: ");
//        double payRate = myScanner.nextDouble();
//
//        double grossPay = hoursWorked * payRate;
//
//        System.out.println("Employee name: " + name);
//        System.out.println("Gross pay: $" + grossPay);

    }

    public static String getName(Scanner inputScanner) {
        //prompting user for information
        System.out.println("Enter your name: ");
        String name = inputScanner.nextLine();
        return name;
    }

    public static double getHoursWorked (Scanner inputScanner){
        System.out.println("Enter the hours worked(don't you exaggerate) ");
        String userInput = inputScanner.nextLine();
        double hourseWorked = Double.parseDouble(userInput);
        return hourseWorked;
    }

    public static double getPayRate(Scanner theScanner){
        System.out.println("Enter your pay rate (again, honesty is the best policy! )");
        String userPayRate = theScanner.nextLine();
        double payRate = Double.parseDouble(userPayRate);
        return payRate;
    }

    public static double calculateGrossPay(double payRate, double hours) {
        double grosspay = payRate * hours;
        return grosspay;
    }

    public static double calculateOt (double hoursWorked, double payRate){
        double otHours = 0;
        if (hoursWorked > 40){
            otHours = hoursWorked - 40;
        }
        double otPayRate = 1.5 * payRate;

        double otPay = otHours * otPayRate;
        return otPay;
    }
}
