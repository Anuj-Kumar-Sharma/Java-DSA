package dsa.course.array2;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("Longest consecutive one is " + findConsecutiveOnes(new int[]{1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1}));
    }

    private static int findConsecutiveOnes(int[] arr) {

        int count=0, max=0;
        for( int i:arr){
            if(i==1){
                count++;
            }else {
                max=Math.max(count, max);
                count=0;
            }
        }

        return Math.max(count, max);
    }
}
