package sda.powtorka.tydzien2.OOP;

public abstract class Car {

    String producer;
    String model;
    String color;
    int seatsNumber;
    Engine engine;

    public Car() {
        this.seatsNumber = 2;
    }

    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }
}
