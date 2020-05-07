package encapsulamento.desafios.desafio.application;

import encapsulamento.desafios.desafio.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String response = sc.nextLine();
        if (response.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(name, number, initialDeposit);
        } else {
            account = new Account(name, number);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);



    }
}
