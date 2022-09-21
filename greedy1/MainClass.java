package greedy1;

import java.util.*;

public class MainClass {
	
	
	class Item {
	    int value, weight;
	    Item(int x, int y){
	        this.value = x;
	        this.weight = y;
	    }
	}
	
	
	double fractionalKnapsack(int W, Item a[], int n) {
        Arrays.sort(a, new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                return i1.weight*i2.value - i2.weight*i1.value;
            }
        });
        
        double ans = 0;
        for(int i = 0; i<n; i++) {
            if(W >= a[i].weight) {
                ans += a[i].value;
                W -= a[i].weight;
            } else {
                ans += (double)((a[i].value * W) / (double)a[i].weight);
                break;
            }
        }
        return ans;
    }
	
	static class Pair implements Comparable<Pair>{
        int s, e;
        public Pair(int s, int e) {
            this.s = s;
            this.e = e;
        }
        
        public int compareTo(Pair that) {
            return this.e - that.e;
        }
    }
    
    public static int activitySelection(int start[], int end[], int n){
       if(n == 0) return 0;
       Pair[] a = new Pair[n];
       for(int i = 0; i<n; i++) {
           a[i] = new Pair(start[i], end[i]);
       }
       Arrays.sort(a);
       
       int curEnd = a[0].e;
       int ans = 1;
       
       for(int i = 1; i<n; i++) {
        //   System.out.println(curEnd);
           if(a[i].s > curEnd) {
               ans++;
               curEnd = a[i].e;
           }
       }
       
       return ans;
    }

	public static void main(String[] args) {
		

	}

}
