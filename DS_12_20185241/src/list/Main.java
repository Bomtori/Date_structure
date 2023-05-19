package list;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.deleteLastNode();
//		list1.insertFront("Park", list1.searchNode("Joo"));
//		list1.insertFront("Lee", list1.searchNode("Joo"));
//		list1.insertFront("Jeon", list1.searchNode("Moon"));
		
		LinkedList list2 = new LinkedList();
		list2.addFirst("1");
		list2.addFirst("2");
		list2.addFirst("3");
		
		LinkedList.concatList(list1, list2).print();
	}
}
