package general;

public class GenList {
	private ListNode head; 
	void insertData(Object x) { 
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = head;
		head = newNode;
	}

	void printGL() {
		System.out.print("(");
		ListNode p = head;
		while (p != null) {
			if (p.data instanceof GenList) {
				((GenList) p.data).printGL();
			} else {
				System.out.print(p.data);
			}
			if ((p = p.link) != null) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}

	public GenList copy() {
		GenList gn = new GenList();
		gn.head = theCopy(head);
		return gn;
	}

	private ListNode theCopy(ListNode h) {

	}

	public boolean equal(GenList T) {
		return theEqual(this.head, T.head);
	}

	private boolean theEqual(ListNode s, ListNode t) {

	}

	public int depth() {
		return theDepth(head);
	}

	private int theDepth(ListNode h) {

	}

}
