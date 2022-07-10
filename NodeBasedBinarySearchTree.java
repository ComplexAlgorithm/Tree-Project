

public class NodeBasedBinarySearchTree<T extends Comparable<T>> extends Object implements BinarySearchTreeInterface<T> {
	//instance variables
	private BinaryNode<T> root; //reference to a BinaryNode object
	
	//default constructor
	public NodeBasedBinarySearchTree() {
		super();
		root = null;
	}
	
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		root = recursiveAdd(root,item);
	}
	
	private BinaryNode<T> recursiveAdd(BinaryNode<T> currentNode, T item) {
		if(currentNode == null) { 
			currentNode = new BinaryNode<T>(item);
		}
		else if(item.compareTo(currentNode.getData()) < 0) { //it means item comes before data in currentNode (alphabetically)
			currentNode.setLeft(recursiveAdd(currentNode.getLeft(),item));
		}
		else if(item.compareTo(currentNode.getData()) > 0) { //it means items comes after data in currentNode (alphabetically)
			currentNode.setRight(recursiveAdd(currentNode.getRight(),item));
		}
		
		return currentNode;
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		
		return recursiveContains(root,item);
	}
	
	private boolean recursiveContains(BinaryNode<T> currentNode, T item) {
		if(currentNode == null) {
			return false;
		}
		else if(item.compareTo(currentNode.getData()) < 0) {
			return recursiveContains(currentNode.getLeft(),item);
		}
		else if(item.compareTo(currentNode.getData()) > 0) {
			return recursiveContains(currentNode.getRight(),item);
		}
		else { //the item that is being searched is equal to the item in the currentNode
			return true;
		}
		
	}

}
