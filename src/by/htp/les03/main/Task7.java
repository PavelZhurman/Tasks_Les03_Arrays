package htp.les03.Main;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		int n = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		int maxN = 0;
		int minN = 0;

		System.out.println("Введите количество чисел последовательности");
		Scanner kol = new Scanner(System.in);
		n = kol.nextInt();

		double[] arr = new double[n];

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
			if (arr[i] > max) {
				max = arr[i];
				maxN = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				minN = i;
			}

		}
		arr[maxN] = min;
		arr[minN] = max;

		for (int u = 0; u < arr.length; u++) {
			System.out.print(arr[u] + " ");
		}
		kol.close();
		input.close();

	}
}
