package binaryTreeBasics;

public class MainClass {

	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
		
		Node root = bTree.createBinaryTree();
		
		bTree.inOrderTraversal(root);

	}

}
