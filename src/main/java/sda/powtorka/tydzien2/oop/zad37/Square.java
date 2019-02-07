package sda.powtorka.tydzien2.oop.zad37;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double countArea() {
        return side * side;
    }

    @Override
    public void diplayArea() {
        System.out.println("Figura: Kwadrat, pole: " + countArea());

    }
}
