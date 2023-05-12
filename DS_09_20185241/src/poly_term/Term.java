package poly_term;

public class Term {
	private int coef;
	private int exp;
	
	public Term(int coef, int exp) {
		this.coef = coef;
		this.exp = exp;
	}
	
	public int getCoef() {
		return coef;
	}
	
	public int getExp() {
		return exp;
	}
}
