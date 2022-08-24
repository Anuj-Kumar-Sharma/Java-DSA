package binaryTree3;

import java.util.*;

import binaryTree2.MainClass.TreeNode;

public class MainClass {

	class Node
	{
	    int data;
	    Node left, right;
	    Node(int key)
	    {
	        data = key;
	        left = right = null;
	    }
	}
	
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
	
//	https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1
	public static ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        isPresent(root, target, ans);
        return ans;
    }
    
    public static boolean isPresent(Node root, int target, ArrayList<Integer> ans) {
        if(root == null) return false;
        if(root.data == target || isPresent(root.left, target, ans) || isPresent(root.right, target, ans)) {
            ans.add(root.data);
            return true;
        }
        return false;
    }
    
    
    
    
	
//    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(right == null) return left;
        if(left == null) return right;
        
        return root;
    }
    
    
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode> l1 = new ArrayList<>();
//         ArrayList<TreeNode> l2 = new ArrayList<>();   
        
//         isPresent(root, p.val, l1);
//         isPresent(root, q.val, l2);
        
//         int i = l1.size()-1;
//         int j = l2.size()-1;
        
//         while(i >= 0 && j >= 0 && l1.get(i).val == l2.get(j).val) {
//             i--;
//             j--;
//         }
        
//         if(i == l1.size()-1) return null;
//         return l1.get(i+1);
        
//     }
    
//     public boolean isPresent(TreeNode root, int target, ArrayList<TreeNode> ans) {
//         if(root == null) return false;
//         if(root.val == target || isPresent(root.left, target, ans) || isPresent(root.right, target, ans)) {
//             ans.add(root);
//             return true;
//         }
//         return false;
//     }
    
    
    
    
//    https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
    Node prev = null, head = null;
    Node bToDLL(Node root) {
	    bToDLLUtil(root);
	    return head;
    }
    
    void bToDLLUtil(Node root) {
        if(root == null) return;
	    
	    bToDLLUtil(root.left);
	    if(prev == null) {
	        head = root;
	    } else {
	        root.left = prev;
	        prev.right = root;   
	    }
	    prev = root;
	    
	    bToDLLUtil(root.right);
    }
    
    
    
}
