package dsa.course.array3;

public class SplitArrayIntoEqualSum {
    public static void main(String[] args) {
        SplitArrayIntoEqualSum splitArrayIntoEqualSum= new SplitArrayIntoEqualSum();
        splitArrayIntoEqualSum.splitArrayIntoEqualSum(new int[]{2,4,3,15,10,14,6,6,6,6});
    }

    public void splitArrayIntoEqualSum(int[] a){
        long sum=0;
        for(int i:a) sum+=i;
        long curSplit=sum/3,  split= sum/3;
        int start=0;

        for (int i = 0; i < a.length; i++) {
            curSplit-=a[i];

            if(curSplit==0){
                System.out.println("Sub array range is from "+ start + " to " + i);
                start=i+1;
                curSplit=split;
            }
        }

    }
}
