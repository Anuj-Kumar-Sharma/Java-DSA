package dsa.course.array3;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementProblem {
    public static void main(String[] args) {
        MajorityElementProblem majorityElementProblem= new MajorityElementProblem();
        System.out.println("Majority element is: " + majorityElementProblem.findMajorityElement(new int[]{2,5,2,1,1,1,2,2,2}));
    }
    public int findMajorityElement(int[] a){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>a.length/2)
               return i;
        }
        return Integer.MIN_VALUE;
    }
}
