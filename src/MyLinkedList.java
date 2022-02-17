
public class MyLinkedList<T> {

	private Node head;

	public void add(T value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node node = head;
			while (node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(new Node(value));
		}
	}
	
	public void show() {
		Node node = head;
		System.out.println(node.getValue());
		while (node.getNext() != null) {
			System.out.println(node.getNext().getValue());
			node = node.getNext();
		}
	}

	public void insertAtStart(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
	}
	
	public void insertAtIndex(int index, int value) {
		int count = 1;
		if (index == 0) {
			insertAtStart(value);
		} else {
			Node node = head;
			while (count < index) {
				node = node.getNext();
				count++;
			}
			Node rest = node.getNext();
			Node newNode = new Node(value);
			newNode.setNext(rest);
			node.setNext(newNode);
		}
	}
	
	public void delete(int index) {
		int count = 1;
		if (index == 0) {
			head = head.getNext();
		} else {
			Node node = head.getNext();
			while (count < index) {
				node = node.getNext();
				count++;
			}
			
			Node rest = node.getNext().getNext();
			node.setNext(rest);
		}
		
		
	}
}
