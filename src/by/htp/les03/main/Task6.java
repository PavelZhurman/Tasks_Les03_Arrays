package htp.les03.Main;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		int n = 0;
		double z = 5.3;
		int k = 0;
		
		Scanner quantity = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.println("Введите количество чисел последовательности ");
		n = quantity.nextInt();

		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
			if (arr[i] > z) {
				arr[i] = z;
				k++;
			}

		}
		for (int u = 0; u < arr.length; u++) {
			System.out.print(arr[u] + " ");
		}

		quantity.close();
		input.close();
		
		System.out.println();
		System.out.println("Количество замен = " + k + " из " + n);

	}

}
