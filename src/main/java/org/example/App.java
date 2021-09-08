package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{

    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        final double conv = 0.09290304;
        int length, width, areaft;
        double aream;
        Scanner read = new Scanner(System.in);
        System.out.println( "What is the length of the room in feet?");
        length = read.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = read.nextInt();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet." );
        System.out.println("The area is");
        areaft = length * width;
        System.out.println(areaft + " square feet");
        aream = areaft * conv;
        System.out.println(df.format(aream) + " square meters");
    }
}
