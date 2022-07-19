package dsa.course.array1;

public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Given array is " + (isSortedArray(new int[]{1,2,6,4,5})?"sorted.": "not sorted."));
    }

    private static boolean isSortedArray(int[] arr) {
        for (int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
