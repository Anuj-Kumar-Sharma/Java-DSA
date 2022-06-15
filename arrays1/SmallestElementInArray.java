package dsa.course.array1;

public class SmallestElementInArray {
    public static void main(String[] args) {
        System.out.println("Smallest element is: " + findSmallestElement(new int[]{3,2,4,5}));
    }

    private static int findSmallestElement(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i:arr) min= Math.min(min, i);
        return min;
    }
}
