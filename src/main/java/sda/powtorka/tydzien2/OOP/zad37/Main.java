package sda.powtorka.tydzien2.OOP.zad37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String rect, squa, circ;
        int rectInt, squareInt, circleInt;

        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile ma byc poszczegolnych figur");

        System.out.print("Ile prostokatow: ");
        rect = sc.nextLine();
        rectInt = Integer.parseInt(rect);

        System.out.print("Ile kwadratow: ");
        squa = sc.nextLine();
        squareInt = Integer.parseInt(squa);

        System.out.print("Ile kol: ");
        circ = sc.nextLine();
        circleInt = Integer.parseInt(circ);

        List<Figure> listaFigur = new ArrayList<>();

        for (int i = 0; i < rectInt; i++) {
            int sideA, sideB;
            sideA = random.nextInt(10) + 1;
            sideB = random.nextInt(10) + 1;
            Rectangle rectangle = new Rectangle(sideA, sideB);
            listaFigur.add(rectangle);
        }

        for (int i = 0; i < squareInt; i++) {
            int side;
            side = random.nextInt(10) + 1;
            Square square = new Square(side);
            listaFigur.add(square);
        }

        for (int i = 0; i < circleInt; i++) {
            int radius;
            radius = random.nextInt(10) + 1;
            Circle circle = new Circle(radius);
            listaFigur.add(circle);
        }

        for (int i = 0; i < listaFigur.size(); i++) {
            listaFigur.get(i).diplayArea();
        }
    }
}
