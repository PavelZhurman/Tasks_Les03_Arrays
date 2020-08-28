package by.htp.les03.main;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		int m = 5;
		int count = 0;
		int[] arr = new int[m];

		int mm;

		init(arr);
		printArr(arr);
		mm = nullArrK(arr, count);
		
		int[] arr2 = new int[mm];
		
		arr2 = nullArr(arr, mm);
		printArr(arr2);

	}

	public static void init(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(2);

		}

	}

	public static void printArr(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		System.out.println();
	}

	public static int nullArrK(int[] mas, int count) {

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0)
				count++;
		}
		return count;
	}

	public static int[] nullArr(int[] mas, int size) {
		int[] mass = new int[size];
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				mass[count] = i;
				count++;
			}
		}
		return mass;
	}
}
