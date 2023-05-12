package recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial1(5));
		System.out.println(factorial2(5));
		
	}
		public static int factorial1(int number) {
			//재귀함수를 이용하여 구현
			if (number <= 1) {
				return 1;
			} else {
				return number * factorial1(number - 1);
			}
		}
		
		public static int factorial2(int number) {
			//반복문을 이용하여 구현
			if(number <= 1) {
				return 1;
			}else {
				for(int i = number - 1; i > 0; i--) {
					number *= i;
				}
			}
			return number;	
		}
	

}
