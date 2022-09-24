package greedy2;

import java.util.*;

class Node {
	char c;
	int f;
	Node left, right;
	public Node(char c, int f, Node left, Node right) {
		this.c = c;
		this.f = f;
		this.left = left;
		this.right = right;
	}
}

public class MainClass {
	
	static Node huffmanEncoding(char c[], int freq[]) {
		PriorityQueue<Node> pq = new
				PriorityQueue<>((n1, n2) -> n1.f-n2.f);
		int n = c.length;
		for(int i = 0; i<n; i++) {
			pq.add(new Node(c[i], freq[i], null, null));
		}
		
		while(pq.size() > 1) {
			Node left = pq.poll();
			Node right = pq.poll();
			
			Node newNode = 
					new Node('_', left.f + right.f, left, right);
			pq.add(newNode);
		}
		return pq.poll();
	}
	
	static void traverse(Node root, String s, Map<Character, String> map) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			map.put(root.c, s);
			return;
		}
		traverse(root.left, s+'0', map);
		traverse(root.right, s+'1', map);
	}
	
	static String encoding(String s, Map<Character, String> map) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<s.length(); i++) {
			sb.append(map.get(s.charAt(i)));
		}
		
		return sb.toString();
	}
	
	static String decoding(String s, Map<Character, String> map) {
		
	}

	public static void main(String[] args) {
		
		char c[] = {'a', 'b', 'c', 'd'};
		int freq[] = {1, 1, 1, 1};
		
		Node root = huffmanEncoding(c, freq);
		
		Map<Character, String> map = new HashMap<>();
		
		traverse(root, "", map);
		
		System.out.println(map);
		
		String s = "abaabcabcad";
		
		System.out.println(encoding(s, map));
		
	}

}
