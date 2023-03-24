package Homework1;

import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        /*
        Write a program that calculates the area of a slice of pizza
         (area of a circle is πr2) assuming that the diameter of the pizza is 14 inches
         and it is cut into 8 pieces
        Modify your program from question 5 to take the diameter
         and the number of slices from the keyboard
        */
        double d, r, a, slice;
        int s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter diameter");
        d= scan.nextDouble();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter number of slices, must me whole number");
        s= scan1.nextInt();
        r= d*.5;
        a= Math.PI *(r*r);
        slice= a/s;
        System.out.println(slice);
    }
}
