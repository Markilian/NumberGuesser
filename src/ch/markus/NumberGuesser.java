package ch.markus;

import java.util.Scanner;

public class NumberGuesser {
    public static int guess;
    public static int number;
    public static int guessAmount;
    public static int range;

    public static void main(String[] args) {
        askforGuess();
        System.out.println(guessAmount);
        askforRange();
        System.out.println(range);
        generateNumber();
        for (int i = 0; i <= guessAmount; i++) {
            guessNumber();
            if (i < guessAmount) {
                if (check(guess, number)) {
                    break;
                }
            }
            if (i == guessAmount) {
                check(guess, number);
                answer(number);
            }
        }
    }

    public static int askforGuess() {
        System.out.println("How many guesses do you want?");
        Scanner sc = new Scanner(System.in);
        guessAmount = sc.nextInt();
        System.out.println("You have " + guessAmount + " guesses");

        return guessAmount;
    }

    public static int askforRange() {
        System.out.println("What range should it be?");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        System.out.println("Your range is from 1 to " + range);

        return range;
    }

    public static int guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess a number");
        guess = scanner.nextInt();
        System.out.println("Your number is " + guess);
        return guess;
    }

    public static int generateNumber() {
        double x = Math.random() * 10 + 1;
        number = (int) x;
        return number;
    }

    public static boolean check(int guess, int number) {
        if (number < guess) {
            System.out.println("Your guess is to high");
            return false;
        } else if (number > guess) {
            System.out.println("Your guess is to low");
            return false;
        } else if (number == guess) {
            System.out.println("Your guess is correct");
            return true;
        } else {
            System.out.println("failure");
            return false;
        }
    }

    public static void answer(int number) {
        System.out.println("The correct answer was " + number);
    }
}
