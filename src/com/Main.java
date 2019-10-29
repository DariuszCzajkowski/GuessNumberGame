package com;

import java.util.Scanner;

public class Main {


    private static int randomNumber(int range) {
        double chosen =Math.random() *range;
        chosen = chosen + 1;
        int chosenNumber= (int) chosen;
        return chosenNumber;


        }


    public static void main(String[] args) {
        // write your code here
        int random = randomNumber(100);
        int index = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("start the game");
        System.out.println("Computer pick random number from 1 to 100 ");
        System.out.println("Guess what is the number");

        for (int i = 1; i <= 10; i++) {
            System.out.println("you have " + index + " chance left");

            int guessNumber = scanner.nextInt();

            if (guessNumber == random) {
                System.out.println("You Win great job");
                return ;
            } else if (guessNumber>random) {
                System.out.println("The number is smaller than " + guessNumber);
            } else if (guessNumber<random){
                    System.out.println("The number is greater than "+ guessNumber);
                }


            else if (index==1)
            {
                System.out.println("you loooooosssssse , the number was: "+random);
            }
            index--;


        }
    }
}