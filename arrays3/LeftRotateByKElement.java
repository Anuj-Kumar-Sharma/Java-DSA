package dsa.course.array3;

import java.util.Arrays;

public class LeftRotateByKElement {
    public static void main(String[] args) {
        LeftRotateByKElement leftRotateByKElement= new LeftRotateByKElement();
        int[] a = {1,2,3,4,5,6,7,8,9};
        int k =12;
        System.out.println("Original Array is - " + Arrays.toString(a));
        System.out.println("Array after rotation is - " + Arrays.toString(leftRotateByKElement.leftRotateByKElement(a,k)));

    }

    public int[] leftRotateByKElement(int[] a, int k) {
        k =k%a.length;
        int[] temp = Arrays.copyOf(a, k);
        for (int i = k; i < a.length; i++) {
            a[i-k]=a[i];
        }

        for(int i= a.length-k, j=0; i<a.length;i++, j++){
            a[i] =temp[j];
        }
        return a;
    }
}
