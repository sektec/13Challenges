package com.example.a13challenges;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type in number for A");
        int a = input.nextInt();
        System.out.println("type in number for B");
        int b = input.nextInt();

//adding
        System.out.println("the sum of " + a + " and " + b + " is " + (a+b));

//subtracting and division
        if (a<b) {
            System.out.println("The difference of " + b + " and " + a + " is " + (b-a));
            if (a == 0){
                System.out.println("This equation is undefined since you cant divide by 0");
            }
            else {
                System.out.println("The product of " + b + " divided by " + a + " is " + (b/a));    }
        }
        else if (a>b){
            System.out.println("The difference of " + a + " and " + b + " is " + (a-b));
            if (b == 0){
                System.out.println("This equation is undefined since you cant divide by 0");
            }
            else {
                System.out.println("The product of " + a + " divided by " + b + " is " + (a/b));
            }
        }
        else {
            System.out.println("The digits are the same so the difference of "
                    + a + " and " + b +" is " + (a-b));
            if (b == 0){
                System.out.println("This equation is undefined since you cant divide by 0");
            }
            else {
                System.out.println("Since the digits are the same the product of "
                        + a + " divided by " + b + " is " + (a/b));
            }
        }

//multiplication
        System.out.println("The product of " + a + " multiplied by " + b + " is " + (a*b));
    }
}
