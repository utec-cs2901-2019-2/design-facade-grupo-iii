package Facade;

public class Sum {
	public static Double sum(Double ... args) {
		Double sum = 0;
		for (Double x: args) {
			sum += x;
		}
		return sum;
	}
}

