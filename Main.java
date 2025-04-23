
class Vehicle {
    public void start() {
        System.out.println("Pojazd został uruchomiony.");
    }

    public void stop() {
        System.out.println("Pojazd został zatrzymany.");
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Samochód został uruchomiony. Sprawdzanie systemów...");
    }

    @Override
    public void stop() {
        System.out.println("Samochód został zatrzymany. Wyłączanie silnika...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car samochod = new Car(5);
        samochod.start();
        samochod.stop();
        System.out.println("Liczba miejsc: " + samochod.getNumberOfSeats());
    }
}
