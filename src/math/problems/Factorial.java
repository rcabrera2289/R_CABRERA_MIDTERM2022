package math.problems;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
            /*
             * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
             * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
             *
             */

            Scanner scanner = new Scanner(System.in);

            int i, fact = 1;
        System.out.println("Factorial for: 22 ");
            int number = scanner.nextInt();

        for(i=1;i<=number;i++)

            {
                fact = fact * i;
            }
        System.out.println("Factorial of "+number+" is: "+fact);

        }
    }
