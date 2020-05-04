package introducao.desafios.desafio01.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double diagonal() {
        double c = ((width * width) + (height * height));
        return Math.sqrt(c);
    }

}
