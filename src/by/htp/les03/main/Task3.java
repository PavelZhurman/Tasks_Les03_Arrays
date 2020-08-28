package by.htp.les03.main;

public class Task3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 2, 4, 5 };

		isSeqAsc(arr);

	}

	public static void isSeqAsc(int[] mas) {
		int count = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i - 1] < mas[i]) {
				count++;
			}
		}
		if (count == mas.length - 1) {
			System.out.println("последовательность возрастающая");
		} else {
			System.out.println("последовательность не возрастающая");
		}

	}

}
