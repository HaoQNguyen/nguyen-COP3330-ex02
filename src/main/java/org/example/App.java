/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int l = s.length();
        System.out.printf("%s has %d characters.", s, l);
    }
}
