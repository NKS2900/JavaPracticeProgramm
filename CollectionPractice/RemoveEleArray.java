package CollectionPractice;

import java.util.Scanner;

public class RemoveEleArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int delele=20;
		int[] a = { 10, 20, 30, 40, 50 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (delele == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Element not found.....");
		} else {
			System.out.println("element deleted successfully.....");
			for (int i = 0; i < a.length-1; i++) {
				System.out.println(a[i]);
			}

		}
	}

}
