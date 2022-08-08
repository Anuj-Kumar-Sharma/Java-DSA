package linkedListDoubts;

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
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	static Node linkedListAddition(Node head1, Node head2) {
		Node r1 = reverseLL(head1);
		Node r2 = reverseLL(head2);
		
		Node head = null;
		int carry = 0;
		
		while(r1 != null || r2 != null || carry == 1) {
			int sum = carry;
			if(r1 != null) {
				sum += r1.data;
				r1 = r1.next;
			}
			if(r2 != null) {
				sum += r2.data;
				r2 = r2.next;
			}
			
			int digit = sum % 10;
			carry = sum / 10;
			
			Node newNode = new Node(digit);
			if(head == null) {
				head = newNode;
			} else {
				newNode.next = head;
				head = newNode;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		
	}

}
