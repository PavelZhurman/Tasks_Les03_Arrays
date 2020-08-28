package by.htp.les03.main;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		int k = 2;
		int size = 5;
		int summ = 0;

		int[] arr = new int[size];

		arr = createArr(size);
		summ = sum(arr, k);
		System.out.println(summ);

	}

	public static int[] createArr(int m) {
		int[] ar = new int[m];

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
		return ar;
	}

	public static int sum(int[] arr, int k) {
		int summ = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				summ += arr[i];
			}
		}
		return summ;
	}

}
