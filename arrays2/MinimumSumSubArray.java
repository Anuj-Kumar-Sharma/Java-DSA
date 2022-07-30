package dsa.course.array2;

public class MinimumSumSubArray {
    public static void main(String[] args) {
        System.out.println("Minimum sum sub array is : " + findMinimumSumSubArray(new int[]{5,2,3,7,8,4}));
    }

    private static int findMinimumSumSubArray(int[] a) {
        int cur=0, min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            cur+=a[i];
            if(cur<min){
                min=cur;
            }
            if(a[i]>0){
                cur=0;
            }
        }
        return min;
    }
}
