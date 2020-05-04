package introducao.desafios.desafio01.application;

import introducao.desafios.desafio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width  =  sc.nextDouble();
        rectangle.height =  sc.nextDouble();
        System.out.print("AREA: " + rectangle.area());
        System.out.println();
        System.out.print("PERIMETER: " + rectangle.perimeter());
        System.out.println();
        System.out.print("DIAGONAL: " + rectangle.diagonal());
        System.out.println();

        sc.close();

    }
}
