package com.pluralsight;

public class Main {

    /*
    https://programmingbydoing.com/
    Parallel arrays - Assignment #151
     */

    public static void main(String[] args) {

        //Create a new instance of records
        Records records = new Records();

        //Print all of the records stored
        records.printAllRecords();

        //Prompt the user for their student ID and print their record only
        System.out.println("Enter your student ID:");
        records.printSpecifiedRecord();

    }
}
