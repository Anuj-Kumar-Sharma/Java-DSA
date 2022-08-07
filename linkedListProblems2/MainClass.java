package linkedListProblems2;

import java.util.Scanner;

public class MainClass {
	
	static Node findMiddleLL(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	static Node reverseLL(Node head) {
		Node cur = head, prev = null;
		while(cur != null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
	
	static boolean isPalindrome(Node head) {
		if(head == null || head.next == null) return true;
		
		Node mid = findMiddleLL(head);
		Node rev = reverseLL(mid);
		
		Node left = head;
		Node right = rev;
		
		while(right != null) {
			if(left.data != right.data) return false;
			left = left.next;
			right = right.next;
		}
		return true;
	}
	
	static Node mergeTwoSortedLL(Node head1, Node head2) {
		Node head = null, tail = null;
		Node a = head1, b = head2;
		
		if(a == null) return b;
		if(b == null) return a;
		
		if(a.data <= b.data) {
			head = a;
			tail = a;
			a = a.next;
		} else {
			head = b;
			tail = b;
			b = b.next;
		}
		
		while (a != null && b != null) {
			if(a.data <= b.data) {
				tail.next = a;
				tail = a;
				a = a.next;
			} else {
				tail.next = b;
				tail = b;
				b = b.next;
			}
		}
		
		if(a == null) tail.next = b;
		if(b == null) tail.next = a;
		
		return head;
	}
	
	public static void main(String[] args) {
		
//		Node head1 = new Node(4);
//		head1.next = new Node(3);
//		head1.next.next = new Node(3);
//		head1.next.next.next = new Node(3);
//		head1.next.next.next.next = new Node(4);
////		head1.next.next.next.next.next = new Node(5);
////		head1.next.next.next.next.next.next = new Node(6);
////		head1.next.next.next.next.next.next.next = new Node(7);
//		Node head2 = new Node(1);
//		head2.next = new Node(3);
//		head2.next.next = new Node(5);
//		head2.next.next.next = new Node(9);
		
//		Node head = mergeTwoSortedLL(head1, head2);
		
//		printLL(head1);
//		System.out.println(isPalindrome(head1));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of nodes");
		int n = sc.nextInt();
		Node head = null, cur = null;
		
		while(n-- != 0) {
			int data = sc.nextInt();
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			} else {
				cur.next = newNode;
			}
			cur = newNode;
		}
		
		
		
	}
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	static void printLL(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data+" ");
			cur = cur.next;
		}
		System.out.println();
	}
}
