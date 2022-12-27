package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Whole Number of Stars: ");
        int userInput= sc.nextInt();

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for (int i = 0; i <= userInput; i++) {
            for (int j = userInput; j >= i ; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }


        }

