package com.tgt.igniteplus;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        System.out.println("Demonstrating Simple if");
        System.out.println("We are going to play a guessing game");
        System.out.println("Enter any number from 1 to 10");
        int secret = 8;
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(n==secret)
            System.out.println("Yayyyy!!!Guessed correctly");
        System.out.println("Have a great day");
    }
}
