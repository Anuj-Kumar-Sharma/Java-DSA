package binarySearchTree1;

import binaryTree3.MainClass.TreeNode;

public class MainClass {

	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	public TreeNode insertIntoBST(TreeNode root, int key) {
        if(root == null) return new TreeNode(key);
        
        if(key > root.val) {
            root.right = insertIntoBST(root.right, key);
        } else if(key < root.val) {
            root.left = insertIntoBST(root.left, key);
        }
        
        return root;
    }
    
//     public TreeNode insertIntoBST(TreeNode root, int key) {
//         TreeNode parent = null, cur = root;
//         while(cur != null) {
//             if(key > cur.val) {
//                 parent = cur;
//                 cur = cur.right;
//             } else if(key < cur.val) {
//                 parent = cur;
//                 cur = cur.left;
//             }
//         }
//         TreeNode newNode = new TreeNode(key);
//         if(parent == null) return newNode;
        
//         if(key > parent.val) {
//             parent.right = newNode;
//         } else if(key < parent.val) {
//             parent.left = newNode;
//         }
        
//         return root;
//     }
	
	static boolean isPresent(Node root, int key) {
		if(root == null) return false;
		System.out.println(root.data);
		if(root.data == key) return true;
		
		if(key > root.data) {
			return isPresent(root.right, key);
		} 
		
		return isPresent(root.left, key);
	}
	
	static boolean isPresentIterative(Node root, int key) {
		Node cur = root;
		while(cur != null) {
			if(cur.data == key) return true;
			if(key > cur.data) cur = cur.right;
			else cur = cur.left;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(80);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right.left = new Node(70);
		root.right.right = new Node(100);
		root.right.left.left = new Node(60);
		
		int key = 60;
		
//		System.out.println(isPresent(root, key));
//		
		System.out.println(isPresentIterative(root, key));
		

	}
}

class Node {
	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
	}
}
