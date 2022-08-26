package binarySearch1;

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
	 
	
	public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        int level = 0;
        rightSideView(root, level, ans);
        return ans;
    }
    
    void rightSideView(TreeNode root, int level, ArrayList<Integer> ans) {
        if(root == null) return;
        
        if(ans.size() == level) {
            ans.add(root.val);
        }
        
        rightSideView(root.right, level+1, ans);
        rightSideView(root.left, level+1, ans);
    }
	
	static ArrayList <Integer> verticalOrder(Node root) {
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        if(root == null) return null;
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(0, root));
        while(!q.isEmpty()) {
            Pair cur = q.poll();
            int key = cur.hd;
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<Integer>());
            }
            map.get(key).add(cur.node.data);
            
            if(cur.node.left != null) {
                q.add(new Pair(key-1, cur.node.left));
            }
            if(cur.node.right != null) {
                q.add(new Pair(key+1, cur.node.right));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(ArrayList<Integer> e: map.values()) {
            ans.addAll(e);
        }
        return ans;
    }
    
    static class Pair {
        int hd;
        Node node;
        
        public Pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }
}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.offer(null);
        
        ArrayList<Integer> curList = new ArrayList<>();
        
        while(!q.isEmpty()) {
            TreeNode cur = q.poll();
            if(cur == null) {
                ans.add(curList);
                if(q.isEmpty()) return ans;
                q.offer(null);
                curList = new ArrayList<>();
            } else {
                curList.add(cur.val);
                
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        return ans;
    }
    
}
