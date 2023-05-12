package recursion2;

public class GCD {
	public static void main(String[] args) {
		System.out.println("36, 12 : " + gcd(36, 12));
		System.out.println("36, 12 : " + lcm(36, 12));
		
		int[] array1 = {12, 36, 48, 24, 27};
		
		int[] array2 = new int[10];
		array2[0] = 2;
		array2[3] = 4;
		array2[5] = 8;
		
		System.out.println("Array 1 : " + multi_gcd(array1));
		System.out.println("Array 2 : " + multi_gcd(array2));
	}
	
	public static int gcd(int a, int b) {
		if(a % b != 0) 
			return gcd(b, a%b);
		else
			return b;
	}
	
	public static int lcm(int a, int b) {
		return gcd(a, b)*(a/gcd(a, b)) * (b/gcd(a, b));
	}
	
	public static int multi_gcd(int[] array) {
		int[] max_num=null;
		int tmp=0;
		for(int a:array) {
			if(a!=0)
				tmp++;
		}
		max_num=new int[tmp];
		tmp=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]!=0) {
				max_num[tmp]=array[i];
				tmp++;
			}
		}
		int result=max_num[0];
		for(int i=1; i<tmp; i++)
			result=gcd(result, max_num[i]);
		return result;
	}
}
