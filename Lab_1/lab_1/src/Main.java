package Train;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Створюємо масив об'єктів типу Train
        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train("Kyiv", 1, 800, 200, 50, 100, 50));
        trains.add(new Train("Lviv", 2, 900, 300, 70, 150, 80));
        trains.add(new Train("Kharkiv", 3, 1000, 250, 60, 120, 70));
        trains.add(new Train("Odesa", 4, 1100, 280, 65, 130, 85));
        trains.add(new Train("Dnipro", 5, 1200, 220, 55, 110, 55));

        // a) Список поїздів, які прямують до заданого пункту призначення
        String destination = "Kyiv";
        ArrayList<Train> trainsToDestination = new ArrayList<>();
        for (Train train : trains) {
            if (train.getDestination().equals(destination)) {
                trainsToDestination.add(train);
            }
        }
        System.out.println("Список поїздів, які прямують до " + destination + ":");
        for (Train train : trainsToDestination) {
            System.out.println(train.getNumber());
        }

        // b) Список поїздів, які прямують до заданого пункту призначення та відправляються після заданої години
        int departureTime = 1000;
        ArrayList<Train> trainsToDestinationAfterTime = new ArrayList<>();
        for (Train train : trains) {
            if (train.getDestination().equals(destination) && train.getDepartureTime() > departureTime) {
                trainsToDestinationAfterTime.add(train);
            }
        }
        // c) Список поїздів, в яких є вільні місця (будь-якого типу)
        ArrayList<Train> trainsWithFreeSeats = new ArrayList<>();
        for (Train train : trains) {
            if (train.getTotalSeats() > 0) {
                trainsWithFreeSeats.add(train);
            }
        }
        System.out.println("Список поїздів, в яких є вільні місця:");
        for (Train train : trainsWithFreeSeats) {
            System.out.println(train.getNumber());
        }

        // d) Кількість вільних місць у заданому поїзді
        int trainNumber = 2;
        for (Train train : trains) {
            if (train.getNumber() == trainNumber) {
                int freeSeats = train.getTotalSeats() - train.getCoupeSeats() - train.getPlatskartSeats() - train.getLuxeSeats();
                System.out.println("Кількість вільних місць у поїзді " + trainNumber + ": " + freeSeats);
            }
        }
    }
}
