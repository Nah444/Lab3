package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput = 0;
        int n = 1;
        String answer = "Y";

        do {
            System.out.println("Learn your squares and cubes!");
            System.out.println(" ");

            System.out.print("Enter an integer: ");
            userInput = scan.nextInt();
            System.out.println(" ");

            System.out.println("Number\t" + " " + "Squared\t" + "Cubed\t");
            System.out.println("=======\t" + " " + "=======\t" + "=======\t");

            for (n = 1; n <= userInput; ++n) {
                System.out.print(n + "\t");
                System.out.print(" " + "\t");
                System.out.println(" " + (int) Math.pow(n, 2) + "\t " + "      " + (int) Math.pow(n, 3));
            }

            System.out.print("Press Y to continue: ");
            System.out.println(" ");
            answer = scan.next();
        }
        while (answer.equals("Y"));
    }
}
