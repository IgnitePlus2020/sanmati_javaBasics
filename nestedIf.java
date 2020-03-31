package com.tgt.igniteplus;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        System.out.println("Let's Play");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter either 0 or 1");
        int n= in.nextInt();
        if(n==1){
            System.out.println("Okay so you want to play???");
            String str= in.nextLine();
            if(str=="yes")
                System.out.println("Cool!");
            else if(str=="no")
                System.out.println("Not cool");
            else
                System.out.println("I don't understand gibberish");
        }
        else
            System.out.println("Okay...so you don't want to play");
    }
}
