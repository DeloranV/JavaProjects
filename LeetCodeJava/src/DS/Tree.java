package DS;

class TreeNode{
	int key;
	String character;
	TreeNode left, right;
	
	TreeNode(int key, String character){
		this.key = key;
		this.character = character;
		left = right = null;
	}
}

class BinaryTree{
	TreeNode root;
	
	BinaryTree(int key, String character) {
		root = new TreeNode(key, character);
	}
	
	void inOrder(TreeNode node) {
		if(node == null) return;
		
		if (node.character != null)
			if (node.character.equals("a"))
				return;

		inOrder(node.left);
		System.out.println(node.key + node.character);
		inOrder(node.right);
		
	}
}

public class Tree {

	public static void main(String[] args) {
		
		String[][] znaki = {{"c","1"},{"d","1"},{"b","2"},{"r","2"},{"a","5"}};
		int[] coded = new int[10];
		
		
		BinaryTree tree = new BinaryTree(100,null);
		tree.root.left = new TreeNode(5, "a");
		tree.root.right = new TreeNode(2, "r");
		tree.root.right.left = new TreeNode(2, "b");
		tree.root.right.right = new TreeNode(1, "d");
		tree.root.right.left.left = new TreeNode(1, "c");
		
		tree.inOrder(tree.root);
		
		System.out.println("a".equals("v"));
	}

}
