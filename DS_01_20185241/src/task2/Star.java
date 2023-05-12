package task2;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			max = sc.nextInt();
			if (max < 0) {
				break;
			}
			for (int i = 0; i < max; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
	}
}
