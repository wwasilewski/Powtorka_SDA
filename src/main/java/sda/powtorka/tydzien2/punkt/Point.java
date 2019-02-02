//Utwórz klasę Point, posiadającą pola publiczne: double x, double y.
//Utwórz dwa obiekty tej klasy w funkcji main i wyświetl ich zawartość.
//Dodaj do klasy Point gettery (accessor) i settery (mutuator) oraz metodę
//double distance(Point point), obliczającą odległość euklidesową. Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)

package sda.powtorka.tydzien2.punkt;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Euclidean distance
    public double distance(Point point) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = point.getX();
        double y2 = point.getY();

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
