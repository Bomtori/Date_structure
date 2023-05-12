package task4;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray4 {
	public static final int ARRAY_MAX = 30;
	
	public static void main(String[] args) {
		int[] array1 = new int[ARRAY_MAX];
		int input;
		double sum = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받아 배열에 저장
		for (int i = 0; i < array1.length; i++) {
			input = sc.nextInt();
			
			if (input < 0) {
				break;
			}
			
			array1[i] = input;
		}
		
		//내림차순 정렬
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if(array1[i] > array1[j]) {
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		
		for (double num : array1) {
			sum += num;
		}
		
		double average = sum / array1.length;
		
		System.out.println(Arrays.toString(array1));
		System.out.println("Avg : " + average);
	}
}
