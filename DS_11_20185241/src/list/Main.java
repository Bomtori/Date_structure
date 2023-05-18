package list;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst("Kim");
		list1.addFirst("Joo");
		list1.insert("Moon", list1.searchNode("Kim"));
		list1.insertFront("Park", list1.searchNode("Joo"));
		list1.insertFront("Choi", list1.searchNode("Moon"));
		list1.print();
	}
}
