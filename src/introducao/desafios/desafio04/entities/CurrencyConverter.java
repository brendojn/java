package introducao.desafios.desafio04.entities;

public final class CurrencyConverter {

    public static double calcDollar(double priceDollar, double qttDollar) {
        return priceDollar * qttDollar + percent(priceDollar, qttDollar);

    }

    public static double percent(double priceDollar, double qttDollar) {
        return (priceDollar * qttDollar) * 0.06;
    }

}
