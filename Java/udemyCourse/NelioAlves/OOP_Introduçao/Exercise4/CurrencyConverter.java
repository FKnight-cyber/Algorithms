package Exercise4;

public class CurrencyConverter {
    public static double dollarPrice = 5.32;
    public static double IOF = 0.06;

    public static double buyDollars(double dollars) {
        return dollarPrice * dollars * (1 + IOF);
    }
}
