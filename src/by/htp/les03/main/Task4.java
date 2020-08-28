package htp.les03.Main;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		int k = 0;
		int n = 0;
		int x = 0;

		System.out.println("Введите количество чисел последовательсноти");
		Scanner quantity = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		k = quantity.nextInt();

		int[] sequence = new int[k];

		System.out.println("Введите числа последовательности");

		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = input.nextInt();
			if (sequence[i] == 0) {
			} else {
				if (sequence[i] % 2 == 0) {
					n++;
				}
			}
		}

		if (n == 0) {
			System.out.println("В последовательности нет чётных чисел");
		} else {
			int[] arr = new int[n];
			for (int u = 0; u < sequence.length; u++) {
				if (sequence[u] == 0) {
				} else {
					if (sequence[u] % 2 == 0) {

						arr[x] = sequence[u];
						x++;
					}
				}
			}
			System.out.println("Массив из чётных чисел:");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
		}
		quantity.close();
		input.close();
	}

}
