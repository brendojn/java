package introducao.desafios.desafio04.application;

import introducao.desafios.desafio04.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantityDollar = sc.nextDouble();
        System.out.println("Amount to be paid in reais  = " + CurrencyConverter.calcDollar(priceDollar, quantityDollar));

    }
}
