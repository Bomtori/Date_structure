package ex1;

public class PrintArray {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		
		printArray(array1);
	}
	
	public static void printArray(int[] array) {
		System.out.print("Output : ");
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(array[i] + ", ");
			}
		}
	}
}
