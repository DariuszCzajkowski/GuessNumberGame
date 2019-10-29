package com;

import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        // write your code here
        int chosen = (int)(Math.random()*100)+1;
        int index = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("start the game");
        System.out.println("Computer pick random number from 1 to 100 ");
        System.out.println("Guess what is the number");

        for (int i = 1; i <= 10; i++) {
            System.out.println("you have " + index + " chance left");

            int guessNumber = scanner.nextInt();

            if (guessNumber == chosen) {
                System.out.println("You Win great job");
                return ;
            } else if (guessNumber>chosen) {
                System.out.println("The number is smaller than " + guessNumber);
            } else if (guessNumber<chosen){
                    System.out.println("The number is greater than "+ guessNumber);
                }


            else if (index==1)
            {
                System.out.println("you loooooosssssse , the number was: "+chosen);
            }
            index--;


        }
    }
}