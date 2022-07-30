package dsa.course.array2;

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        TrappingRainWaterProblem trappingRainWaterProblem = new TrappingRainWaterProblem();
        System.out.println("Total water can be stored: " + trappingRainWaterProblem.trappingRainWaterProblemWith0Space(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    int trappingRainWaterProblem(int[] a) {
        int[] l =  new int[a.length];
        int[] r =  new int[a.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l.length;i++){
            max = Math.max(max, a[i]);
            l[i]=max;
        }
//        System.out.println("Left array: " + Arrays.toString(l));

        max=Integer.MIN_VALUE;
        for(int i=r.length-1;i>=0;i--){
            max = Math.max(max, a[i]);
            r[i]=max;
        }
//        System.out.println("Right array: " + Arrays.toString(r));

        int water=0;
        for(int i=0;i<a.length;i++){
            water += Math.min(l[i], r[i])-a[i];
        }

        return water;
    }



    int trappingRainWaterProblemWith0Space(int[] a) {

        int lMax=Integer.MIN_VALUE;
        int rMax=Integer.MIN_VALUE;
        int l=0, r=a.length-1;
        int water=0;

      while(l<r){
          if(a[l]<a[r]){
              lMax=Math.max(lMax, a[l]);
              water+= lMax-a[l];
              l++;
          }else{
              rMax=Math.max(rMax, a[r]);
              water+= rMax-a[r];
              r--;
          }
      }
        return water;
    }

}
