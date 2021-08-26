/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void handleOutput(int sum, int quotient, int product, int difference, int[] input) {
        System.out.println(
                input[0] + " + " + input[1] +" = "+ sum +"\n" +
                input[0] + " - " + input[1] + " = " + difference + "\n" +
                input[0] + " * " + input[1] + " = " + product + "\n" + input[0] + " / " + input[1] + " = " + quotient + "\n"
        );
    }

    public static int getSum(int[] values)
    {
        return values[0] + values[1];
    }

    public static int getDiff(int[] val)
    {
        if (val[0] > val[1]) {
            return val[0] - val[1];
        } else if (val[0] < val[1]) return val[1] - val[0];
        return 0;
    }

    public static int getProduct(int[] val)
    {
        return val[0] * val[1];
    }

    public static int getQuotient(int[] val)
    {
        return val[0] / val[1];
    }

    public static int[] getUserInput()
            throws IOException
    {
        int[] userProvidedNumbers = new int[2];
        System.out.println("What is the first Number? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userProvidedNumbers[0] = Integer.parseInt(reader.readLine());
        System.out.println("What is the second number? ");
        userProvidedNumbers[1] = Integer.parseInt(reader.readLine());

        return userProvidedNumbers;
    }

    public static void main( String[] args ) throws IOException {
        int[] userProvidedNumbers = getUserInput();
        int sum = getSum(userProvidedNumbers);
        int quotient = getQuotient(userProvidedNumbers);
        int product = getProduct(userProvidedNumbers);
        int difference = getDiff(userProvidedNumbers);
        handleOutput(sum, quotient, product, difference, userProvidedNumbers);
    }
}
