package stackDoubts;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		MinStack obj = new MinStack();
		obj.push(5);
		obj.push(2);
		System.out.println("min" + obj.min());
		System.out.println("popped" + obj.pop());
		System.out.println("min" + obj.min());
		obj.push(9);
		obj.push(1);
		obj.push(6);
		System.out.println("min" + obj.min());
		System.out.println("popped" + obj.pop());
		System.out.println("min" + obj.min());
		System.out.println("popped" + obj.pop());
		System.out.println("min" + obj.min());
	}

}

class KStacks {
	int SIZE = 10;
	int k;
	int a[], next[], top[], free;
	public KStacks(int k) {
		this.k = k;
		a = new int[SIZE];
		next = new int[SIZE];
		top = new int[k];
		free = 0;
		
		Arrays.fill(top, -1);
		for(int i = 0; i<SIZE-1; i++) {
			next[i] = i+1;
		}
		next[SIZE-1] = -1;
	}
	
	boolean isFull() {
		return free == -1;
	}
	
	boolean isStackEmpty(int sn) {
		return top[sn] == -1;
	}
	
	void push(int data, int sn) throws Exception {
		if(isFull()) throw new Exception("Array is Full");
		int i = free;
		free = next[i];
		next[i] = top[sn];
		top[sn] = i;
		a[i] = data;
	}
	
	int pop(int sn) throws Exception {
		if(isStackEmpty(sn)) throw new Exception("Stack is Empty");
		int i = top[sn];
		top[sn] = next[i];
		next[i] = free;
		free = i;
		return a[i];
	}
	
	int peek(int sn) throws Exception {
		if(isStackEmpty(sn)) throw new Exception("Stack is Empty");
		int i = top[sn];
		return a[i];
	}
}

class MinStack {
	ArrayDeque<Integer> stack = new ArrayDeque<>();
	private int min = 0;
	
	void push(int t) {
		if(stack.isEmpty()) {
			min = t;
			stack.push(t);
			return;
		}
		if(t >= min) {
			stack.push(t);
		} else {
			stack.push(2*t-min);
			min = t;
		}
	}
	
	int pop() throws Exception {
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		int t = stack.pop();
		if(t >=  min) {
			return t;
		} else {
			int ans = min;
			min = 2 * min - t;
			return ans;
		}
	}
	
	int min() throws Exception {
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		return min;
	}
	
	int peek() throws Exception {
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		int t = stack.peek();
		if(t >= min) {
			return t;
		} else {
			return min;
		}
	}
	

	
	
}