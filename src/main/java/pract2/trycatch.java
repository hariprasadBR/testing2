package pract2;

import org.apache.poi.util.SystemOutLogger;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 55, 66, 75, 654 };
		int[] b = new int[a.length];

//		int[] b= {}
		for (int i = 0; i < a.length; i++) {

			b[i] = a[a.length - i - 1];

		}

		for (int i = 0; i < a.length - 1; i++) {

			System.out.println(b[i]);
		}

	}
}
