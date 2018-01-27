package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Records {

    String[] lastNames = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
    Double[] grades = {99.5, 78.5, 95.6, 96.8, 82.7};
    Integer[] studentIDs = {123456, 813225, 823669, 307760, 827131};

    public void printAllRecords(){
        System.out.print("Values:\n");
        for (int i = 0; i < lastNames.length; i++)
            System.out.print( "\t" + lastNames[i] + " " + grades[i] + " " + studentIDs[i] + "\n");
    }

    public void printSpecifiedRecord() {
        Scanner keyboard = new Scanner(System.in);
        do{
            char pass = 'N';
            try {
                int enteredID = keyboard.nextInt();
                for (int i = 0; i < lastNames.length; i++) {
                    if (enteredID == studentIDs[i]) {
                        System.out.print(lastNames[i] + " " + grades[i] + " " + studentIDs[i]);
                        pass = 'Y';
                    }
                }
                if (!(pass == 'Y')){
                    System.out.println("Sorry. That student ID wasn't found. Try again");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Must be a valid student number. Try again");
                keyboard.next();
            }
        } while (true);
    }
}
