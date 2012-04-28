package chap1;

import java.util.*;

public class gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("gugudanfrom:");

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		
		printdan();
	}

	private static void printdan() {
		int i;
		int j;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

}
