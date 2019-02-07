package sda.powtorka.tydzien2.OOP.zad37;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void diplayArea() {
        System.out.printf("Figura: Kolo, pole: %.2f %n", countArea());
    }
}
