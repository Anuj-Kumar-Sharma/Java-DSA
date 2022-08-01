package linkedListProblems1;

public class MainClass {

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
	
	static Node reverseRecursiveLL(Node head) {
		if(head == null || head.next == null) return head;
		Node temp = head.next;
		Node newHead = reverseRecursiveLL(head.next);
		temp.next = head;
		head.next = null;
		return newHead;
	}
	
	static void printLL(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data+" ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	static Node reverseK(Node head, int k) {
		Node cur = head, prevFirst = null, newHead = null;
		while(cur != null) {
			int count = 0;
			Node prev = null, first = cur; 
			while(cur != null && count < k) {
				Node temp = cur.next;
				cur.next = prev;
				prev = cur;
				cur = temp;
				count++;
			}
			if(newHead == null) {
				newHead = prev;
			} else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return newHead;
	}
	
	static Node isCyclePresent(Node head) {
		Node slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}
	
	static Node findCycleStartingNode(Node head) {
		Node meet = isCyclePresent(head);
		if(meet == null) return null;
		Node cur = head;
		while(cur != meet) {
			cur = cur.next;
			meet = meet.next;
		}
		return cur;
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(4);
		head.next.next.next.next.next = new Node(5);
		head.next.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next.next = head.next.next.next.next;

		
//		printLL(head);
//		Node newHead = reverseLL(head);
//		Node newHead = reverseRecursiveLL(head);
//		int k = 3;
//		Node newHead = reverseK(head, k);
//		printLL(newHead);
		
		Node meet = isCyclePresent(head);
		if(meet != null) {
			System.out.println("cycle is present");
			Node firstNode = findCycleStartingNode(head);
			System.out.println(firstNode.data);
		} else {
			System.out.println("cycle is not present");
		}
	}

}

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}
