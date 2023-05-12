package recursion;

import java.util.*;

public class Binarysearch {
	
	public static void main(String[] args) {
		int array1 [] = {1, 6, 13, 41, 45, 68, 70, 74, 81, 100};
		int array2 [] = {100, 68, 13, 41, 45, 6, 70, 74, 81, 1};
		
		System.out.println("array1에서 68의 위치 : " + search(array1, 68));
		System.out.println("array2에서 68의 위치 : " + search(array2, 68));
	}
	
	public static int search(int a [], int key) {
		int [] sortedArr = a.clone();
		Arrays.sort(sortedArr);
		
		if(Arrays.equals(a, sortedArr)) {	
		} else {
			System.out.println("ERROR : 배열이 정렬되어 있지 않습니다.");
			return -1;
		}
		return binarySearch(a, key, 0, a.length -1);
		
		
	}
	
	private static int binarySearch(int array[], int key, int left, int right) {
		if(left<=right) {
			int n=(left+right)/2;
			if(array[n]==key)
				return n;
			else if(array[n]>key)
				return binarySearch(array, key, left, n-1);
			else
				return binarySearch(array, key, n+1, right);
		}
		else
			return -1;
	}
}