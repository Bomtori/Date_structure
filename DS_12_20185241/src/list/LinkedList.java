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
	
	public void delete(ListNode p) {
		if(first==null)
			return;
		else if(p.getLink()==null)
			return;
		else {
			if(p.getLink().getLink()==null)
				p.setLink(null);
			else
				p.setLink(p.getLink().getLink());
			length--;
		}
	}
	
	public void invert() {
		ListNode node=first;
		ListNode temp=null;
		ListNode end=null;
		while(node!=null) {
			end=temp;
			temp=node;
			node=node.getLink();
			temp.setLink(end);
		}
		first=temp;
	}
	
	public static LinkedList concatList(LinkedList list1, LinkedList list2) {
		if(list1 == null || list2 == null)
			return null;
		else {
			LinkedList newList = new LinkedList();
			ListNode node1 = list1.first;
			ListNode node2 = list2.first;
			while(node1 != null) {
				newList.addFirst(node1.getName());
				node1 = node1.getLink();
			}
			while(node2 != null) {
				newList.addFirst(node2.getName());
				node2 = node2.getLink();
			}
			newList.invert();
			newList.length = list1.length() + list2.length();
			return newList;
		}
	}
	
	public void append(String name) {
		ListNode newNode = new ListNode(name, null);
		if(first == null) {
			first = newNode;
		} else {
			ListNode node = first;
			while(node.getLink() != null) {
				node = node.getLink();
			}
			node.setLink(newNode);
		}
		length++;
	}
	
	public void deleteLastNode() {
		if(first == null)
			return;
		else if(first.getLink() == null)
			first=null;
		else {
			ListNode node = first;
			while(node.getLink().getLink() != null)
				node=node.getLink();
			node.setLink(null);
			length--;
		}
	}
}
