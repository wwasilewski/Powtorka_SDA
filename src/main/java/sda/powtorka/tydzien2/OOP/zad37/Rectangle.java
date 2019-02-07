package sda.powtorka.tydzien2.OOP.zad37;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public double countArea() {
        return sideA * sideB;
    }

    @Override
    public void diplayArea() {
        System.out.println("Figura: Prostokąt, pole: " + countArea());
    }
}
