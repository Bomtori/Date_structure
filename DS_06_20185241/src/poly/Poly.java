package poly;

public class Poly {
	private static final int MAX = 30;
	private int[] coef;
	private int degree;
	
	public Poly() {
		coef = new int[MAX];
		degree = -1;
	}
	
	public boolean isPZero() {
		return degree == -1;
	}
	
	public int coef(int e) {
		if(degree >= 0)
			return coef[e];
		else
			return 0;
	}
	
	public int maxExp() {
		return degree;
	}
	
	public boolean addTerm(int c, int e) {
		if(coef[e] != 0)
			return false;
		else {
			coef[e] = c;
			if(degree < e)
				degree = e;
			return true;
		}
	}
	
	public boolean delTerm(int e) {
		if(coef[e] != 0) {
			coef[e] = 0;
			if(e == degree) {
				int eee = 0;
				for(int i = 0; i <= degree; i++) {
					if(coef[i] != 0)
						eee = i;
				}
				degree = eee;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public void printResult() {
		for(int i = degree; i >= 0; i--) {
			if(coef[i] != 0) {
				if(i != maxExp())
					System.out.print(" + ");
				System.out.print(coef[i]);
				if(i != 0)
					System.out.print("x^" + i);
			}
		}
		System.out.println();
	}
}
