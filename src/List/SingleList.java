package List;

public class SingleList {
	public Node head = new Node(1);
	public Node end;

	public void insert(int element) {
		Node temp = head;
		Node newNode = new Node(element);
		while (temp!=null && temp.nextNode != null) {
			temp = temp.nextNode;
		}
		head.nextNode = newNode;
	}
	public void traversing() {
		Node temp = head;
		while (temp.nextNode != null && temp.value >0) {
			System.out.println("temp-> currentValue " + temp.value);
			temp = temp.nextNode;
		}
	}

	public int lengthOfList() {
		int count = 0;
		Node temp = head;
		while (temp.nextNode != null) {
			count++;
		}
		return count;
	}

	public void delete(int element) {
		Node temp = head;
		while (temp.nextNode != null) {
			Node nextNode = temp.nextNode;
			if (nextNode.value == element) {
				temp.nextNode = nextNode.nextNode;
			}
		}
	}
}
