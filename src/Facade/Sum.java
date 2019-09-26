package Facade;

public class Sum {
	public static double sum(double ... args) {
		double sum = 0;
		for (double x: args) {
			sum += x;
		}
		return sum;
	}
}

