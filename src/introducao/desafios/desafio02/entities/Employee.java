package introducao.desafios.desafio02.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary = netSalary() + (this.grossSalary * (percentage / 100));
    }

    public String toString() {
        return "Employee: "
        + this.name
        + ", "
        + "$ "
        + netSalary();
    }
}
