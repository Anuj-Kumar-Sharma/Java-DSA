package dsa.course.array2;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        System.out.println("Array after moving zeroes at the end: " + Arrays.toString(moveZeroes(new int[]{1,0,2,0,1,2,2,0})));
    }

    private static int[] moveZeroes(int[] a) {

        int l=0, r=a.length-1;

        while(l<r){
            if(a[r] ==0){
                r--;
            }else if(a[l]==0){
                int temp = a[r];
                a[r]=a[l];
                a[l]=temp;
                l++;
                r--;
            }else{
                l++;
            }
        }
        return a;
    }
}
