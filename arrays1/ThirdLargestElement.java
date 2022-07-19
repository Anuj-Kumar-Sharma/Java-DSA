package dsa.course.array1;

import java.util.Arrays;

public class ThirdLargestElement {
    public static void main(String[] args) {
        System.out.println("Third Largest element is: "+ findThirdLargest(new int[]{2,3,1,4,8,6,5}));
    }

    private static int findThirdLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}
