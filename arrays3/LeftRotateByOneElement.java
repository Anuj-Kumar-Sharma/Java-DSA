package dsa.course.array3;

import java.util.Arrays;

public class LeftRotateByOneElement {
    public static void main(String[] args) {
        LeftRotateByOneElement leftRotateByOneElement= new LeftRotateByOneElement();
        int[] a = {1,2,3,4};
        System.out.println("Original Array is - " + Arrays.toString(a));
        System.out.println("Array after rotation is - " + Arrays.toString(leftRotateByOneElement.leftRotateByOneElement(a)));

    }

    public int[] leftRotateByOneElement(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1]=a[i];
            if(i==a.length-1)
                a[i]=temp;
        }
        return a;
    }
}
