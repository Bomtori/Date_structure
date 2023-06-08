package poly3;

public class Polynomial {
	private PolyNode firstNode;
	private PolyNode lastNode;
	
	public Polynomial() {
		firstNode = null;
		lastNode = null;
	}
	
	public boolean ispZero() {

	}
	
	public void addTerm(int c, int e) {

	}
	
	public void delTerm(int e) {

	}
	
	public Polynomial sMult(int c, int e) {

	}
	
	public Polynomial polyMult(Polynomial q) {

	}
	
	public void print() {
		PolyNode p = firstNode;
		while(p != null) {
			System.out.print(p.coef + "x^" + p.exp + " + ");
			p = p.link;
		}
		System.out.println();
	}
	
	public void appendTerm(int c, int e) {

	}
	
	public Polynomial polyAdd(Polynomial poly) {

	}
}
