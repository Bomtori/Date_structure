package poly_term;

public class PolyTerm {
	private static final int MAX = 50;
	private Term[] terms;
	private int noOfTerms;
	
	//계수가 저장되는 coef 배열 초기
	public PolyTerm() {
		terms = new Term[MAX];
		noOfTerms = 0;
	}
	
	//다항식이 비어있을 경우 true 리턴;
	public boolean isPZero() {
		return noOfTerms == 0;
	}
	
	//해당 차수에 해당하는 계수를 반환
	public int coef(int e) {
	    for (int i = 0; i < noOfTerms; i++) {
	        if (terms[i].getExp() == e) {
	            return terms[i].getCoef();
	        }
	    }
	    return 0;
	}

	
	//현재 다항식의 최고 차수 반환
	public int maxExp() {
		return terms[0].getExp();
	}
	
	//e의 차수에 계수 c를 삽입, degree 변경
	//단, coef[e]에 이미 계수가 존재하는 경우 계수 c를 삽입하지 않고 false 리턴
	public boolean addTerm(int c, int e) {
	    if (coef(e) == 0) {
	        Term tt = new Term(c, e);
	        int tmp = noOfTerms;
	        for (int i = noOfTerms - 1; i >= 0; i--) {
	            if (terms[i].getExp() < e) {
	                terms[i + 1] = terms[i];
	                tmp = i;
	            }
	        }
	        terms[tmp] = tt;
	        noOfTerms++;
	        return true;
	    } else {
	        return false;
	    }
	}
	
	//e의 차수를 갖는 계수를 다항식에서 삭제
	public boolean delTerm(int e) {
		if(coef(e) != 0) {
			int idx = 0;
			for(int i = 0; i < noOfTerms; i++) {
				if(terms[i].getExp() == e) {
					idx = i;
					break;
				}
			}
			for(int i = idx; i < noOfTerms - 1; i++)
				terms[i] = terms[i + 1];
			terms[noOfTerms - 1] = null;
			noOfTerms--;
			return true;
		}else
			return false;
	}
	
	
	public PolyTerm sMult(int c, int e) {
		PolyTerm p = new PolyTerm();
	    for (int i = 0; i < noOfTerms; i++) {
	        p.terms[i] = new Term(c * terms[i].getCoef(), e + terms[i].getExp());
	    }
	    p.noOfTerms = noOfTerms;
	    return p;
	}
	
	public PolyTerm polyAdd(PolyTerm poly1) {
	    PolyTerm p = new PolyTerm();
	    int pidx = 0, idx = 0;

	    while(pidx < poly1.noOfTerms && idx < noOfTerms) {
	        if(poly1.terms[pidx].getExp() == terms[idx].getExp()) {
	            int coefSum = poly1.terms[pidx].getCoef() + terms[idx].getCoef();
	            if(coefSum != 0) { // 계수가 0이 아니면 결과 다항식에 추가
	                p.addTerm(coefSum, poly1.terms[pidx].getExp());
	            }
	            pidx++;
	            idx++;
	        } else if(poly1.terms[pidx].getExp() < terms[idx].getExp()) {
	            p.addTerm(terms[idx].getCoef(), terms[idx].getExp());
	            idx++;
	        } else {
	            p.addTerm(poly1.terms[pidx].getCoef(), poly1.terms[pidx].getExp());
	            pidx++;
	        }
	    }

	    while(pidx < poly1.noOfTerms) {
	        p.addTerm(poly1.terms[pidx].getCoef(), poly1.terms[pidx].getExp());
	        pidx++;
	    }

	    while(idx < noOfTerms) {
	        p.addTerm(terms[idx].getCoef(), terms[idx].getExp());
	        idx++;
	    }

	    return p;
	}

	public PolyTerm polyMult(PolyTerm poly1) {
	    PolyTerm p = new PolyTerm();
	    for(int i = 0; i < poly1.noOfTerms; i++) {
	        PolyTerm tmp = sMult(poly1.terms[i].getCoef(), poly1.terms[i].getExp());
	        for(int j = 0; j < tmp.noOfTerms; j++) {
	            if(tmp.terms[j].getCoef() != 0) { // 계수가 0이 아니면 결과 다항식에 추가
	                p.addTerm(tmp.terms[j].getCoef(), tmp.terms[j].getExp());
	            }
	        }
	    }
	    return p;
	}
	
	
	public void printResult() {
		for(int i = 0; i < noOfTerms; i++) {
			if(terms[i].getCoef() != 0) {
				if(i == noOfTerms-1) {
					System.out.print(" + "+terms[i].getCoef());
					if(terms[i].getExp() > 0)
						System.out.print("x^"+terms[i].getExp());
					System.out.println();
				}else {
					if(i != 0)
						System.out.print(" + ");
					System.out.print(terms[i].getCoef() + "x^" + terms[i].getExp());
				}
			}	
		}
	}
}
