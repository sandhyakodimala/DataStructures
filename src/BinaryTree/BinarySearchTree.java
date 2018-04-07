package BinaryTree;

/* Class containing left and right child of current node and key value*/
public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key > root.key) {
			root.right = insertRec(root.right, key);
		} else if (key < root.key) {
			root.left = insertRec(root.left, key);
		}
		return root;
	}
	
	public void inorder(Node root){
		inorderRec(root);
	}
	 // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(100);
		bst.insert(20);
		bst.insert(30);
		bst.insert(1080);
		bst.inorder(bst.root);		
	}
}
