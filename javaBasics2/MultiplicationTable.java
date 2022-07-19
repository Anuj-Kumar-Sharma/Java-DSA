package dsa.course.javabasics2;

import java.util.Scanner;

public class MultiplicationTable {
    /**
     * 2. Write a Java program that takes a number as input and prints its multiplication table upto 10.
     * @param args
     */

    public static void main(String[] args) {
	printMultiplicaiton();
    }

    private static void printMultiplicaiton() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();
        for(int i=1;i <=10; i++){
            System.out.println(num + " X "+ i +" = " + num*i);
        }
    }
}
