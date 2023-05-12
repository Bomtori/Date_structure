package binary;

public class IntToBinary {
	public static void main(String[] args) {
		System.out.println(intToBinary(100));
	}
	
	private static String intToBinary(int n) {
		String str = "";
		String result = "";
		
		if(n <= 1) {
			str = String.valueOf(n);
		}
		else {
			result = intToBinary(n / 2) + n % 2;
		}
		return str + result;
	}
}
