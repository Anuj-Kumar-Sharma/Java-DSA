package dsa.course.array2;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        System.out.println("Maximum sum sub array is : " + findMaximumSumSubArray(new int[]{6,-5,4,3,-7,5,-4}));
        System.out.println("Maximum sum sub array is : " );
        printMaximumSumSubArray(new int[]{6,-5,4,3,-7,5,-4});
    }

    private static void printMaximumSumSubArray(int[] a) {
        int cur=0, max=Integer.MIN_VALUE, l=0, r=a.length-1, lastL=0;
        for (int i = 0; i < a.length; i++) {
            cur+=a[i];
            if(cur>max){
                max=cur;
                r=i;
                lastL=l;
            }
            if(cur<0){
                cur=0;
                l=i+1;
            }
        }
        for (int i=lastL; i<=r;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    private static int findMaximumSumSubArray(int[] a) {
        int cur=0, max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            cur+=a[i];
            if(cur>max){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
}
