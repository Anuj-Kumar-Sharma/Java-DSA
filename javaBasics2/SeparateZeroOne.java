package dsa.course.javabasics2;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateZeroOne {
    /**
     * 5. Write a Java program to separate Os on left side and 1s on right side of an array of Os and 1s in
     * random order.
     * @param args
     */

    public static void main(String[] args) {
        separateZeroOne();
    }

    private static void separateZeroOne() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter five numbers :");

        int[] arr= new int[5];
        int left=0, right=arr.length-1;
        for(int i=0;i<5;i++){
            int num =scanner.nextInt();
            if(num==0){
                arr[left++]=num;
            }else{
                arr[right--] = num;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
