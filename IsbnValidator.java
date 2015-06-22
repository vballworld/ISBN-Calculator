package com.company;

/**
 * Created by joepak on 6/21/15.
 */
public class IsbnValidator {

    boolean validateISBN(String ISBN) {

        //ensure entered ISBN is 10 digits long
        if (ISBN.length() != 10) {
            System.out.println("ISBNs are 10 digits long.");
            return false;
        }


        char subInput; //stores each digit (left to right)
        int sum = 0;   //sum of ISBN multiplications

        //calculate sum for ISBN
        for (int i = 0, j = 10; i < 10; i++, j--) {
            subInput = ISBN.charAt(i);

            //if last digit = X, add 10 to sum during last iteration & exit loop
            if ((i == 9) & (ISBN.charAt(9) == 'X')) {
                sum += 10;
                break;
            }

            //calculate sum (- 48 to convert string to true int value)
            sum += (subInput - 48) * j;
        }

        //determine from sum whether ISBN is valid
        if ((sum % 11) == 0) {
            System.out.println("Valid ISBN.");
            return true;
        }

        else {
            System.out.println("Not valid ISBN.");
            return false;
        }


    };

}
