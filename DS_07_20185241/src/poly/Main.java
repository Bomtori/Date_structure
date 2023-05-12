package poly;

public class Main {
	public static void main(String[] args) {
		Poly poly1 = new Poly();
		poly1.addTerm(5, 0);
		poly1.addTerm(2, 1);
		poly1.addTerm(3, 2);
		poly1.addTerm(7, 3);
		System.out.print("Poly 1 :");
		poly1.printResult();
		
		Poly poly2 = new Poly();
		poly2.addTerm(-1, 0);
		poly2.addTerm(2, 1);
		poly2.addTerm(-3, 2);
		poly2.addTerm(4, 4);
		System.out.print("Poly 2 : ");
		poly2.printResult();
		
		System.out.print("Poly1 * 2x^0 = ");
		poly1.sMult(2, 0).printResult();
		
		System.out.print("Poly1 * 2x^1 = ");
		poly1.sMult(2, 1).printResult();
		
		System.out.print("Poly1 + Poly2 = ");
		poly1.polyadd(poly2).printResult();
		
		System.out.print("Poly1 * Poly2 = ");
		poly1.polyMult(poly2).printResult();
	}
}
