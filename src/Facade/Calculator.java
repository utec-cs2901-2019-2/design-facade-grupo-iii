package Facade;

public class Calculator {
  public static double sum(double... args) {
    return Sum.sum(args);
  }

  public static double minus(double... args) {
    return Minus.minus(args);
  }

  public static double multiply(double... args) {
    return Multiplication.multiply(args);
  }

  public static double divide(double... args) {
    return Division.division(args);
  }
}
