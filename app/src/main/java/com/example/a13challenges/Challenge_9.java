package com.example.a13challenges;

import java.util.Scanner;

public class Challenge_9 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter The degree of fahrenheit or celsius");
            double D = input.nextDouble();

            System.out.println("if the number is Fahrenheit and want to convert to celsius type '1' " +
                    "if number is Celsius and want to convert to Fahrenheit type '2'");
            int T = input.nextInt();

            switch (T){
                case 1 :
                    System.out.println("The conversion from Fahrenheit to Celsius of "
                            + D + " is " + ((D - 32) * 5/9));
                    break;
                case 2 :
                    System.out.println("The conversion from Celsius to Fahrenheit of "
                            + D + " is " + ((D * 9/5) + 32));
                    break;
                default:
                    System.out.println("Bruh!?!?");
                    System.exit(1);
                    break;
            }
        }
    }

}
