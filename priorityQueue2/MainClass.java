package priorityQueue2;

import java.util.*;

public class MainClass {
	
	//////// find median in a running stream
	
	PriorityQueue<Integer> minHeap, maxHeap;
    boolean even;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        even = true;
    }
    
    public void addNum(int num) {
        if(even) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(even) {
            return (minHeap.peek() + maxHeap.peek())/2.0;
        } else {
            return (double)maxHeap.peek();
        }
    }
    
    ///////////

	static int splitArrayInKSubsets(int a[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i<k; i++) {
			pq.offer(0);
		}
		Arrays.sort(a);
		for(int i = a.length-1; i>=0; i--) {
			int cur = a[i];
			int top = pq.poll();
			int toAdd = cur + top;
			pq.offer(toAdd);
		}
		int max = -1;
		for(int e: pq) {
			max = Math.max(max, e);
		}
		return max;
	}
	
	
	//Function to return the minimum cost of connecting the ropes.
    long minCost(long a[], int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long e: a) {
            pq.offer(e);
        }
        
        long ans = 0;
        while(pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            
            long cost = first + second;
            ans += cost;
            pq.offer(cost);
        }
        
        return ans;
    }
	
	public static void main(String[] args) {
		
		int a[] = {1, 4, 2, 3, 7, 2, 4, 5, 6, 3};
		int k = 3;
		
		System.out.println(splitArrayInKSubsets(a, k));
		
	}

}
