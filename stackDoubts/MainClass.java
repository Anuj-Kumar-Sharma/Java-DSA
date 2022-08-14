package stackDoubts;

import java.util.ArrayDeque;

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