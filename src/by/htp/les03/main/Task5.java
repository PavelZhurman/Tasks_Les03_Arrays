package htp.les03.Main;

import java.util.*;

public class Task5 {
	public static void main(String[] args) {
		int n = 0;
		double max = 0;
		double min = 0;
		double minLength = 0;

		System.out.println("Укажите размерность n последовательности");
		
		Scanner quantity = new Scanner(System.in);
		n = quantity.nextInt();

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		double[] sequence = new double[n];
		
		for (int i = 0; i < sequence.length; i++) {
			System.out.print("введите число ");
			sequence[i] = input.nextDouble();
			System.out.println();
			if (sequence[i] > max) {
				max = sequence[i];
			}
			if (sequence[i] < min) {
				min = sequence[i];
			}

		}
		minLength = max - min;
		System.out.println("Наименьшая длинна числовой оси = " + minLength);
		input.close();
		quantity.close();

	}
}
