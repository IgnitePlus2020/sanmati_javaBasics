package com.tgt.igniteplus;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Demostrating while loop");
        Scanner in= new Scanner(System.in);
        System.out.println("Enter any number");
        int i=1,count =0;
        int n= in.nextInt();
        while(i<n)
        {
            System.out.println("HEY!!! Hope you have a great day");
            i++;
            count++;
        }
        System.out.println("The while loop ran for " + count + " number of times");
    }
}
