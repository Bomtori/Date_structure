package poly;

public class Poly {
	private static final int MAX = 30;
	private int[] coef;	//계수
	private int degree;	//최고차항
	
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
	
	//다항식 전체에 cx^e를곱하는 메소드
	public Poly sMult(int c, int e) {
		Poly p = new Poly();
		for(int i = 0; i <= degree; i++) {
			int ccc = c * coef[i];
			int eee = e + i;
			p.coef[eee] = ccc;
		}
		p.degree = degree + e;
		return p;
	}
	
	//다항식 두 개를 더하는 메소드
	public Poly polyadd(Poly poly1) {
		Poly p = new Poly();
		int pidx = 0, idx = 0;
		while(pidx <= poly1.degree && idx <= degree) {
			if(pidx == idx) {
				p.addTerm(poly1.coef[pidx] + coef[idx], pidx);
				pidx++;
				idx++;
			}else if(pidx > idx) {
				p.addTerm(poly1.coef[pidx], pidx);
				pidx++;
			}else {
				p.addTerm(coef[idx], idx);
				idx++;
			}
		}while(idx <= degree) {
			p.addTerm(coef[idx], idx);
			idx++;
		}while(pidx <= poly1.degree) {
			p.addTerm(poly1.coef[pidx], pidx);
			pidx++;
		}
		
		
		return p;
	}
	
	//다항식 두 개를 곱하는 메소드
	public Poly polyMult(Poly poly1) {
		Poly p = new Poly();
		for(int i = 0; i <= poly1.degree; i++) {
			Poly tmp = sMult(poly1.coef[i], i);
			p = p.polyadd(tmp);
		}
		return p;
	}
}
