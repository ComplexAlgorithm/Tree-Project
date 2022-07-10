

public class BinaryNodeDemo {
	public static void main(String[] args) {
		BinaryNode<Integer> root = new BinaryNode<Integer>(40);
		BinaryNode<Integer> leftNode = new BinaryNode<Integer>(13);
		
		root.setLeft(leftNode);
		
		BinaryNode<Integer> rightNode = new BinaryNode<Integer>(45);
		
		root.setRight(rightNode);
		
		inOrderTraversal(root);
	}
	
	//this method should print each node in the tree using in order traversal rules by visiting left, then root, then right
	//hint: you can use recursion to accomplish the task of this method 
	public static void inOrderTraversal(BinaryNode<Integer> currentNode) {
		if(currentNode != null) {
			inOrderTraversal(currentNode.getLeft()); //recursive call 
			System.out.println(currentNode.getData());
			inOrderTraversal(currentNode.getRight());
		}
		
	}

}