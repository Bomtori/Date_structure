package ex1;

public class TestArray1 {
	public static void main(String[] args) {
		int[] array = {1, 2, 5, 7, 10, 12, 15, 19};
		int result = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 != 0) {
				result += array[i];
			}
		}
		System.out.println(result);
	}

}
