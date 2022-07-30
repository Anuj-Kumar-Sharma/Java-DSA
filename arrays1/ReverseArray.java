package dsa.course.array1;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr) + " reverse array is : " + Arrays.toString(reverseArray(arr)));
    }

    private static int[] reverseArray(int[] arr) {
        int left=0, right=arr.length-1;
        while (left<right){
            int temp = arr[right];
            arr[right--]=arr[left];
            arr[left++]=temp;
        }
        return arr;
    }
}
