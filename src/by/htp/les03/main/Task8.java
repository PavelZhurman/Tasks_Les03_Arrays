package htp.les03.Main;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		int n = 0;

		System.out.println("Введите количество чисел последовательности");

		Scanner kol = new Scanner(System.in);
		n = kol.nextInt();
		Scanner input = new Scanner(System.in);

		int arr[] = new int[n];
		int arrOut[] = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = input.nextInt();
			if (arr[i] > i) {
				arrOut[i] = arr[i];
			}
		}

		for (int u = 0; u < arrOut.length; u++) {
			if (arrOut[u] != 0) {
				System.out.print(arrOut[u] + " ");
			}
		}
		kol.close();
		input.close();
	}
}
