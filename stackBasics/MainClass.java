package stackBasics;

import java.util.ArrayDeque;
//import java.util.Stack;

public class MainClass {
	
	static int[] previousSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int i = 0;
		for(int e: a) {
			while(!stack.isEmpty() && stack.peek() >= e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(e);
			i++;
		}
		return ans;
	}
	
	static boolean matchingParenthesis(String s) {
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(int i = 0; i<s.length(); i++) {
			char cur = s.charAt(i);
			if(cur == '(' || cur == '{' || cur == '[') {
				stack.push(cur);
				continue;
			}
			if(cur == ')' || cur == '}' || cur == ']') {
				if(stack.isEmpty()) return false;
			}
			char top;
			switch(cur) {
			case ')': 
				top = stack.pop();
				if(top != '(') return false;
				break;
			case '}':
				top = stack.pop();
				if(top != '{') return false;
				break;
			case ']':
				top = stack.pop();
				if(top != '[') return false;
				break;
			}
		}
		return stack.isEmpty();
	}
	
	

	public static void main(String[] args) throws Exception {
		
//		String s = "()[]{}()";
//		System.out.println(matchingParenthesis(s));
		
		int a[] = {5, 1, 2, 3, 9, 6, 1, 4, 3};
		int ans[] = previousSmaller(a);
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			System.out.print(ans[i]+" ");
			System.out.println();
		}
		
//		StackUsingArray stack = new StackUsingArray(3);
//		StackUsingLinkedList stack = new StackUsingLinkedList();
		
//		Stack<Integer> stack = new Stack<>();
		
//		ArrayDeque<Integer> stack = new ArrayDeque<>();
//		
//		stack.push(2);
//		stack.push(4);
//		stack.push(1);
//		stack.push(8);
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
	}

}
