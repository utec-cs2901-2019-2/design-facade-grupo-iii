package Facade;

public class Division {

    public static double division(double ... args)
    {
        int counter = 0;
        double dividend = 0.0;

        for (double divisor : args)
        {
            if (counter == 0)
            {
                dividend = divisor;
            }
            else
            {
                if (divisor == 0)
                    throw new IllegalArgumentException("One of the divisors is 0. Cannot divide by 0.");

                dividend = dividend / divisor;
            }
            counter += 1;
        }
        return dividend;
    }
}
