//Utwórz klasę Point, posiadającą pola publiczne: double x, double y.
//Utwórz dwa obiekty tej klasy w funkcji main i wyświetl ich zawartość.
//Dodaj do klasy Point gettery (accessor) i settery (mutuator) oraz metodę
//double distance(Point point), obliczającą odległość euklidesową. Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)

package sda.powtorka.tydzien2.punkt;

public class PointMain {
    public static void main(String[] args) {

        Point point1 = new Point(1, 3);
        Point point2 = new Point(2, 7);

        System.out.println("point A: " + point1.x + ", " + point1.y);
        System.out.println("point B: " + point2.x + ", " + point2.y);

        System.out.println("Euclidean distance between points A-B: " + point1.distance(point2));
    }
}
