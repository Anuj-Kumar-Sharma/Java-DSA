package dsa.course.javabasics2;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    /**
     * 7. Write a Java method to print Fibonacci series of n terms where n is argument passed by user.
     * @param args
     */

    public static void main(String[] args) {
	    printFibonacci();
    }

    private static void printFibonacci() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        if(num==1){
            arr[0]=0;
        }else if(num ==2){
            arr[1]=1;
        }else{
            arr[0]=0;
            arr[1]=1;
            for (int i=2; i<num;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
