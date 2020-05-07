package encapsulamento.desafios.desafio.entities;

public class Account {

    private String name;
    private int number;
    private double initialDeposit;
    private double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
        balance = 0.0;
    }

    public Account(String name, int number, double initialDeposit) {
        this.name = name;
        this.number = number;
        this.initialDeposit = initialDeposit;
        balance = this.initialDeposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance -= (withdraw + 5.00);
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account: " + getNumber()
                + ", " + "Holder: " + getName()
                + ", " + "Balance: $ "
                + String.format("%.2f", getBalance());
    }

}
