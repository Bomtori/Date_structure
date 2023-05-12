package list;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.insert("Jeon", list1.searchNode("Choi"));
		list1.insert("Moon", list1.searchNode("Kim"));
		list1.print();
	}
}
