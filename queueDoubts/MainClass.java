package queueDoubts;

import binarySearch1.Node;

public class MainClass {
	
	class Node
	{
		int data;
		Node next;
		Node bottom;
		
		Node(int d)
		{
			data = d;
			next = null;
			bottom = null;
		}
	}
	
	Node flatten(Node root) {
	    Node cur = root, last = root;
	    
	    while(cur != null) {
	        while(last.next != null) {
	            last = last.next;
	        }
	        if(cur.bottom != null) {
	            last.next = cur.bottom;
	        }
	        cur = cur.next;
	    }
	    
	    return root;
    }


}
