package list;

public class LinkedList {
	private int length;
	private ListNode first;
	
	public LinkedList() {
		length = 0;
		first = null;
	}
	
	public int length() {
		return length;
	}
	
	public ListNode firstNode() {
		return first;
	}
	
	public void addFirst(String name) {
		if(length == 0)
			first = new ListNode(name, null);
		else
			first = new ListNode(name, first);
		length++;
	}
	
	public void print() {
		for(ListNode target = first; target != null; target = target.getLink())
			System.out.println(target.getName());
	}
	
	public ListNode searchNode(String name) {
		ListNode node = first;
		while(node != null) {
			if(node.getName() == name)
				return node;
			node = node.getLink();
		}
		return null;
	}
	
	public void insert(String name, ListNode target) {
		ListNode node = new ListNode(name, target);
		if(first == null)
			first = node;
		else if(target == null) {
			node.setLink(first);
			first = node;
		}else {
			node.setLink(target.getLink());
			target.setLink(node);
		}
		length++;
	}
}
