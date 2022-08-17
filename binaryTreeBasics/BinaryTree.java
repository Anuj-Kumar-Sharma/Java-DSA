package binaryTreeBasics;

import java.util.Scanner;

public class BinaryTree {
	
	Scanner sc;
	Node root;
	
	public BinaryTree() {
		sc = new Scanner(System.in);
	}
	
	// creates a binary tree and returns the root node
	Node createBinaryTree() {
		System.out.println("Enter node data");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		Node node = new Node(data);
		
		System.out.println("Enter "+ data + "'s left data");
		node.left = createBinaryTree();
		
		System.out.println("Enter "+ data + "'s right data");
		node.right = createBinaryTree();
		
		return node;
	}
	
	void inOrderTraversal(Node root) {
		if(root == null) return;
		
		inOrderTraversal(root.left); // Left
		System.out.println(root.data); // Node
		inOrderTraversal(root.right); // Right
	}
	
	void preOrderTraversal(Node root) {
		if(root == null) return;
		
		System.out.println(root.data); // Node
		preOrderTraversal(root.left); // Left
		preOrderTraversal(root.right); // Right
	}
	
	int heightOfABinaryTree(Node root) {
		if(root == null) return 0;
		
		int lh = heightOfABinaryTree(root.left);
		int rh = heightOfABinaryTree(root.right);
		
		return Math.max(lh, rh) + 1;
	}
	
	void printNodesAtKDistance(Node root, int k) {
		if(root == null) return;
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
		printNodesAtKDistance(root.left, k-1);
		printNodesAtKDistance(root.right, k-1);
	}
	
}

class Node {
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
	}
}