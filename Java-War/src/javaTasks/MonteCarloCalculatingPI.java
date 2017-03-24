package javaTasks;

public class MonteCarloCalculatingPI {
	public static void main(String[] args) {
		int i;
		int n = 0;
		int n1 = 0;

		double x, y;

		for (i = 0; i < 1000000; i++) {
			x = Math.random(); // Throw a dart
			y = Math.random();

			n++;

			if (x * x + y * y <= 1)
				n1++;
		}

		System.out.println("Pi/4 = " + (double) n1 / (double) n);
		System.out.println("Pi = " + 4 * (double) n1 / (double) n);
	}
}
