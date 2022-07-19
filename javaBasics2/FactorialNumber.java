package dsa.course.javabasics2;

import java.util.Scanner;

public class FactorialNumber {
    /**
     * 8. Write a program to find the factorial value of any number entered through the keyboard.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Factorial value is: " + findFactorial());
    }

    private static double findFactorial() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fact = scanner.nextInt();
        return factorial(fact);
    }

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

}
