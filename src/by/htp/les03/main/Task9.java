package htp.les03.Main;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		int n = 0;
		int positive = 0;
		int negative = 0;
		int zero = 0;
		double min = 150;
		double max = 300;

		System.out.println("Введите размерность массива N");
		Scanner kol = new Scanner(System.in);

		n = kol.nextInt();

		double[] arr = new double[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((double) (Math.random() * max) - min);

			System.out.print(arr[i] + " ");
			if (arr[i] > 0) {
				positive++;
			}
			if (arr[i] < 0) {
				negative++;
			}
			if (arr[i] == 0) {
				zero++;
			}
		}
		kol.close();
		System.out.println();

		System.out.println("Количество положительных: " + positive + ", отрицательных: " + negative + " и нулевых: "
				+ zero + " элементов");
	}
}
