package Facade;

public class Multiplication {

	public static double multiply(double... args){
		double result = 1;

		for (double x : args) {
			result = result * x;
		}

		return results;
	}
}
