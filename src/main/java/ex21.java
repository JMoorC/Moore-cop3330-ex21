/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int monthInt = inScan.nextInt();
        String monthString = "January";
        switch (monthInt) {
            case 1:
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
        }
        System.out.printf("The name of the month is %s.\n", monthString);
    }
}