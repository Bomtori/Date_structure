package recursion2;

import java.util.Arrays;

public class Reshape {
	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 2;
		array[5] = 4;
		array[9] = 8;
		
		int[] newArray = reshapeArray(array);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));
	}
	
	public static int[] reshapeArray(int[] arr) {
		int[] aaa = null;
		int temp = 0;
		for(int a:arr) {
			if(a != 0)
				temp++;
		}
		aaa = new int[temp];
		temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				aaa[temp] = arr[i];
				temp++;
			}
		}
		return aaa;
	}
}

