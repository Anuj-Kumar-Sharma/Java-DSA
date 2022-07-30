package arrays3;

import java.util.HashMap;
import java.util.Map;

public class FindLargestSubArrayWithZerosOnes {
    public static void main(String[] args) {
        FindLargestSubArrayWithZerosOnes findLargestSubArrayWithZerosOnes= new FindLargestSubArrayWithZerosOnes();
        findLargestSubArrayWithZerosOnes.findLargestSubArrayWithZerosOnes(new int[]{0,0,0,0,0,1,1,0,0,1});
    }

    public void findLargestSubArrayWithZerosOnes(int[] a){
        int prefixSum =0;
        Map<Integer, Integer> map =new HashMap<>();
        int maxLength=0, start=-1, end=-1;
        for (int i = 0; i < a.length; i++) {
            int cur = 1;
            if(a[i]==0) cur=-1;
            prefixSum +=cur;
            if(map.containsKey(prefixSum) ){
                if((i-map.get(prefixSum)) >maxLength){
                    maxLength = i-map.get(prefixSum);
                    start=map.get(prefixSum)+1;
                    end = i;
                }
            }else{
                map.put(prefixSum,i);
            }

        }
        System.out.println("Largest sub array with equal zero and one starts from " + start + " to "+ end);
    }
}
