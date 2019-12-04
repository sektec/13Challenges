package com.example.a13challenges;
import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num >= 64){
            num -= 64;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }

        if (num >= 32){
            num -= 32;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
        if (num >= 16){
            num -= 16;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }

        if (num >= 8){
            num -= 8;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }

        if (num >= 4){
            num -= 4;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }

        if (num >= 2){
            num -= 2;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
        if (num >= 1){
            num -= 1;
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }
}
