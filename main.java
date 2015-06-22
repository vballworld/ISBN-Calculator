package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Read ISBN from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ISBN: ");
        String userInput = scanner.nextLine();

        //create instance of IsbnValidator & feed ISBN into validateISBN method
        IsbnValidator isbnValidator = new IsbnValidator();
        isbnValidator.validateISBN(userInput);
    }
}
