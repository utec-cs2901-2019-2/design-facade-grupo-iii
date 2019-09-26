package Facade;

public class CalculatorTest {
  public static void main(String args[]) {
    System.out.println(Calculator.sum(1.0, 3.0, 7.0, 2.0));
    System.out.println(Calculator.minus(1.0, 5.0, 3));
    System.out.println(Calculator.multiply(7.3, 100.4, 32));
    System.out.println(Calculator.divide(3.0, 4, 5.3, 9.2, 1.2));
    System.out.println(Calculator.divide(3.0, 4, 0));
  }
}
