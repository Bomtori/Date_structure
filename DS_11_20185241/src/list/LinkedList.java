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
	
	public void insertFront(String name, ListNode target) {
		ListNode newNode=new ListNode(name, target);
		if(first==null) 
			addFirst(name);
		else if(first.getLink()==null||target==first) {
			ListNode temp=first;
			first=newNode;
			newNode.setLink(temp);
		}else {
			ListNode node=first;
			while(node!=null) {
				if(target==node.getLink())
					break;
				node=node.getLink();
			}
			newNode.setLink(node.getLink());
			node.setLink(newNode);
		}
		length++;
	}
}
