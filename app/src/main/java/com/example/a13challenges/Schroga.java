package com.example.a13challenges;

public class Schroga {
    public static void two(String num) {
        int num1 = Integer.parseInt(num);
        if (num1 < 0 || num1 > 9) System.exit(0);
        if (num1 < 5) System.out.println(num + " is less than 5.");
        else if (num1 > 5) System.out.println(num + " is more than 5.");
        else System.out.println(num + " is equal to 5.");
    }

    public static void five(String num){
        String num2[] = num.split(" ");
        System.out.println(num2[1] + " " + num2[0]);
    }
    public static void eight(String num){
        char [] num2 = num.toCharArray();
        double total = 0;
        for (int i = num.length(); i > 0; i--){
            if (num2[i] != '1' || num2[i] != '0') System.exit(1);
            total = total + (i ^ 2);
        }
        System.out.println(total);
    }
    public static void eleven(String num){
        String num2[] = num.split(" ");
        System.out.println(num2[1]);
    }
}