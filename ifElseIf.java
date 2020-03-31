package com.tgt.igniteplus;

import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        System.out.println("Demonstrating If-else-if");
        System.out.println("Enter an expression");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first operand");
        int op1=in.nextInt();
        System.out.println("Enter second operand");
        int op2=in.nextInt();
        System.out.println("Enter operator");
        String opr= in.nextLine();
        double res=0;
        if(opr=="+")
            res= op1+op2;
        else if(opr=="-")
            res=op2-op1;
        else if(opr=="*")
            res=op1*op2;
        else
            res=op2/op1;
        System.out.println("Result of expression " + res);

    }
}
