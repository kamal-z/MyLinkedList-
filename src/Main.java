
public class Main {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(16);
		list.insertAtStart(5);
		list.insertAtIndex(0, 35);
		
		list.show();
		list.delete(2);
		System.out.println("---");
		list.show();
		
		

	}

}
