
public class Main {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList();
		list.add(10);
		list.add(16);
		list.insertAtStart(5);
		list.insertAtIndex(0, 35);
		list.show();
		list.delete(2);
		System.out.println("---");
		list.show();
		
		MyLinkedList<String> list2 = new MyLinkedList();
		System.out.println("---");
		list2.add("o1");
		list2.add("o1");
		list2.add("o3");
		list2.show();
		
		MyLinkedList<DummyObject> list3 = new MyLinkedList();
		System.out.println("---");
		list3.add(new DummyObject());
		list3.show();
		
		

	}

}
