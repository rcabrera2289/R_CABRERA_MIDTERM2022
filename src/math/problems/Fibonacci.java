package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("hello world");
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int num1 = 0;
        int num2 = 1;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("fibonacci for:");
        int numbers = scanner.nextInt();
        while(i < numbers){

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i++;
        }

        System.out.print(num1 +" ");

        System.out.print("\n");


    }
}
