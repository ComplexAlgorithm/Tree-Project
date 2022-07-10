
public class BinaryNode<T extends Comparable<T>> extends Object { //Comparable interface has a method called compareTo (-1,0,1)
	//instance variables
	private T data;
	private BinaryNode<T> left; //reference to a BinaryNode<T> object
	private BinaryNode<T> right; //reference to a BinaryNode<T> object
	
	//constructor
	public BinaryNode(T newData) {
		super();
		data = newData;
		left = null;
		right = null;
	}
	
	//non-static methods
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLeft(BinaryNode<T> otherNode) {
		this.left = otherNode;	
	}
	
	public BinaryNode<T> getLeft() {
		return left;
	}
	
	public void setRight(BinaryNode<T> otherNode) {
		this.right = otherNode;
	}
	
	public BinaryNode<T> getRight() {
		return right;
	}
}