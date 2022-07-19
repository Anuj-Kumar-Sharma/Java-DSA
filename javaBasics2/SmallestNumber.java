package dsa.course.javabasics2;

import java.util.Scanner;

public class SmallestNumber {
    /**
     * 6. Write a Java method to find the smallest number among three numbers.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Smallest number is: " + findSmallestNumber());
    }

    private static int findSmallestNumber() {
        int min = Integer.MAX_VALUE;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter three numbers :");

        for(int i=0;i<3;i++){
            min = Math.min(min,scanner.nextInt());

        }

        return min;

    }
}
