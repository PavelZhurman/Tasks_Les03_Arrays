package htp.les03.Main;

public class Task10 {
	public static void main(String[] args) {
		int n = 5;
		int m = 0;
		double max = 0;

		double[] arr = new double[n * 2];
		double[] arr2 = new double[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (double) ((Math.random() * 300));
			System.out.printf("[%6.1f]", arr[i]);

		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i] + arr[arr.length - 1 - m];
			m++;

			System.out.printf("[%6.1f]", arr2[i]);

			if (max < arr2[i]) {
				max = arr2[i];
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("max = " + max);

	}
}
