package introducao.desafios.desafio03.entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double sumGrades() {
        return n1 + n2 + n3;
    }

    public String result() {
        if (sumGrades() < 60.00) {
            return "FINAL GRADE " + " = " + String.format("%.2f", sumGrades()) + "\n" + "FAILED" + "\n" + "MISSING " + String.format("%.2f",(60.00 - sumGrades())) + " POINTS";
        } else {
            return "FINAL GRADE " + " = " + String.format("%.2f",sumGrades()) + "\n" + "PASS";
        }
    }





}
