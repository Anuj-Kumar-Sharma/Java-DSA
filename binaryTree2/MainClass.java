package binaryTree2;

import java.util.*;

public class MainClass {
	
	
//	  Definition for a binary tree node.
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
	 
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        
        TreeNode cur = root;
        
        while(cur != null || !stack.isEmpty()) {
            
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            
            TreeNode pop = stack.pop();
            ans.add(pop.val);
            
            cur = pop.right;
        }
        
        return ans;
    }
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<>();
        
        s1.push(root);
        while(!s1.isEmpty()) {
            TreeNode pop = s1.pop();
            
            s2.push(pop);
            if(pop.left != null) {
                s1.push(pop.left);
            }
            if(pop.right != null) {
                s1.push(pop.right);
            }
        }
        
        while(!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }
	
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            
            ans.add(pop.val);
            
            if(pop.right != null) {
                stack.push(pop.right);
            }
            if(pop.left != null) {
                stack.push(pop.left);
            }
        }
        
        return ans;
    }
	
	 public int diameterOfBinaryTree(TreeNode root) {
	        // if(root == null) return 0;
	        
//	         int ld = diameterOfBinaryTree(root.left);
//	         int rd = diameterOfBinaryTree(root.right);
	        
//	         int lh = height(root.left);
//	         int rh = height(root.right);
//	         int cur = lh + rh;
	        
//	         return Math.max(cur, Math.max(ld, rd));
	        
	        int a[] = new int[1];
	        // IntCustom obj = new IntCustom();
	        height(root, a);
	        return ans;
	        
	        // return obj.a;
	}
	
	int ans = 0;
    
    int height(TreeNode root, int a[]) {
        if(root == null) return 0;
        
        int lh = height(root.left, a);
        int rh = height(root.right, a);
        ans = Math.max(ans, lh+rh);
        
        // obj.a = Math.max(obj.a, lh+rh);
        
        return Math.max(lh, rh) + 1;
    }

	public static void main(String[] args) {
		
		

	}

}
