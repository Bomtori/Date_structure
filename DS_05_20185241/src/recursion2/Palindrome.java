package recursion2;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("abba : " + isPalin("abba"));
		System.out.println("abcba : " + isPalin("abcba"));
		System.out.println("accba : " + isPalin("accba"));
	}
	
	private static boolean isPalin(String s, int j, int k) {
		while(j < k) { // j와 k가 같아질 때까지 반복
			if(s.charAt(j) != s.charAt(k))
				return false;
			++j;
			--k;
		}
		return true;
	}
	
	public static boolean isPalin(String s) {
		return isPalin(s, 0, s.length() - 1);
	}
}
