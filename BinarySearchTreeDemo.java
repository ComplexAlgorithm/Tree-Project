
public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTreeInterface<String> dictionary = new NodeBasedBinarySearchTree<String>();
		dictionary.add("madness");
		dictionary.add("apple");
		dictionary.add("zoo");
		dictionary.add("banana");
		
		System.out.println(dictionary.contains("lion"));
	}

}

	
