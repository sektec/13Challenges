package com.example.a13challenges;

import java.util.Scanner;

public class Challenge_6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int inNum = input.nextInt();
            int reversed = 0;

            while (inNum!=0){
                int single = inNum % 10;
                reversed = reversed * 10 + single;
                inNum/=10;
            }
            System.out.println("Reversed Number: " + reversed);
        }
    }
}
