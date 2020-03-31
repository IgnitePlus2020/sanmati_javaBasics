package com.tgt.igniteplus;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Demonstrating If-Else statement");
        System.out.println("Checking is number is greater than 100");
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n>100)
            System.out.println(n + " is greater than 100");
        else
            System.out.println(n + " is smaller than 100");
    }
}
