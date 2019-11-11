package com.example.a13challenges;
public class Schroga {
        public static void two(int num){
            if(num < 0 || num > 9)System.exit(420);
            if(num<5)System.out.println(num + " is less than 5.");
            else if(num>5)System.out.println(num + " is more than 5.");
            else System.out.println(num + " is equal to 5.");
        }
        public static void five(String num){
            String num2[] = num.split(" ");
            System.out.println(num2[1] + " " + num2[0]);
        }
}
