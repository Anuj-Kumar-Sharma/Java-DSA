package binarySearchTree2;

public class MainClass {

	 public boolean isValidBST(TreeNode root) {
//       This code is not correct
//       if(root == null) return true;
      
//       if((root.left != null && root.left.val >= root.val) && 
//          (root.right != null && root.right.val <= root.val)) return false;
      
//       return isValidBST(root.left) && isValidBST(root.right);
      
//       incorrect code ends here
        
      
      return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }
  
  boolean isValidBST(TreeNode root, long minValue, long maxValue) {
      if(root == null) return true;
      
      if(root.val <= minValue || root.val >= maxValue) return false;
      
      return isValidBST(root.left, minValue, root.val) &&
          isValidBST(root.right, root.val, maxValue);
  }
	
  
  
  
  
  
  
  int distance(Node root, int a) {
      if(root.data == a) return 0;
      if(a < root.data) return 1+ distance(root.left, a);
      return 1+distance(root.right, a);
  }
  
  int findDist(Node root, int a, int b) {
      if(root == null) return 0;
      
      if(a < root.data && b < root.data) {
          return findDist(root.left, a, b);
      } 
      
      if(a > root.data && b > root.data) {
          return findDist(root.right, a, b);
      }
      
      return distance(root, a) + distance(root, b);
  }
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
