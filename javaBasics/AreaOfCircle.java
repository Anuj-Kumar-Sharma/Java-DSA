package dsa.course.javabasics1;

import java.util.Scanner;

public class AreaOfCircle {
    /**
     * 2. Write a Java program to print the area and perimeter of a circle.
     * @param args
     */

    public static void main(String[] args) {
	    printAreaAndPerimeterOfCircle();
    }

    private static void printAreaAndPerimeterOfCircle() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = scanner.nextInt();
        System.out.println("Area of circle is : " + (Math.PI *radius *radius));
        System.out.println("Perimeter of circle is : " + (2*Math.PI *radius));

    }
}
