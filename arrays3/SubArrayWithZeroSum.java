package dsa.course.array3;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    /*
        prefix sum problem
     */

    public static void main(String[] args) {
        SubArrayWithZeroSum subArrayWithZeroSum= new SubArrayWithZeroSum();
        System.out.println("is current Array has 0 sum: " +subArrayWithZeroSum.subArrayWithZeroSum(new int[]{2,1,3,-9,1,7}));
    }
    public  boolean subArrayWithZeroSum(int[] a){
        int sum=0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <a.length; i++) {
            sum+=a[i];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }

        return  false;
    }

}
