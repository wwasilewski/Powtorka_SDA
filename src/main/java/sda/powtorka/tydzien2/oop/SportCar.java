package sda.powtorka.tydzien2.oop;

public class SportCar extends Car {

    public SportCar(String producer, String model, String color, int seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    public SportCar(String producer, String model, String color, int seatsNumber) {
        super(producer, model, color);
        this.seatsNumber = seatsNumber;
    }

    public static void main(String[] args) {
        SportCar sportCar = new SportCar("mercedes", "slk200", "silver", 3);
        System.out.println("model: " + sportCar.model + " seats: " + sportCar.seatsNumber);

        SportCar sportCar2 = new SportCar("mercedes",
                "slr", "black", 3, new Engine(5000, 540, 14));
        System.out.println("model: " + sportCar2.model + " horsepower: " + sportCar2.engine.getHorsePower());
    }
}
