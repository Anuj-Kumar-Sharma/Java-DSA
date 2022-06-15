package dsa.course.array2;

public class FrequencySortedArray {

    public static void main(String[] args) {

        printFrequencyFromSortedArray(new int[]{1,2,2,2,3,3,3});
    }

    private static void printFrequencyFromSortedArray(int[] arr) {

        int count=1;
        for(int i=1; i< arr.length;i++){
            if(arr[i] ==arr[i-1]){
                count ++;
            }else{
                System.out.println(arr[i-1] + " is " + count + " times.");
                count=1;
            }
            if(i== arr.length-1){
                System.out.println(arr[i] + " is " + count + " times.");
            }
        }

    }
}
