package List;

public class Node {
	public int value;
	public Node nextNode;

	public Node(int value, Node nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}
	public Node(int value) {
		this.value = value;
		this.nextNode = null;
	}
	
}
