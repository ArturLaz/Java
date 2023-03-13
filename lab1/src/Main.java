import Train.Train;

import java.util.Scanner;

public class Main {
    private Train[] trains;

    public static void main(String[] args) {
        Main main = new Main();

        main.showExceededTimeInCity();

        main.showUsedTalkOutCity();

        main.showInfoOnRange();

        main.printAll();

    }

    public Main() {
        trains = new Train[3];

        trains[0] = new Train(1, "Мельник", "Анна", "Маріївна", 2131, 8.7, 5.6);
        trains[1] = new Train(1, "Мельник", "Анна", "Маріївна", 2131, 8.7, 5.6);
    }

    public void showExceededTimeInCity() {
        System.out.println("1//////////////////////////////////////");
        System.out.println("Enter given time in city:");
        Scanner scanner = new Scanner(System.in);
        double timeIn = scanner.nextDouble();
        for (Train item : trains) {
            if (item.getShipping_time() > timeIn)
                System.out.println(item.toString());
        }

    }

    public void showUsedTalkOutCity() {
        System.out.println("2//////////////////////////////////////");
        System.out.println("Enter given time out city:");
        Scanner scanner = new Scanner(System.in);
        double timeOut = scanner.nextDouble();
        for (Train item : trains) {
            if (item.getShipping_time() > timeOut)
                System.out.println(item.toString());
        }

    }

    public void showInfoOnRange() {
        System.out.println("Enter the lower limit of account numbers:");
        Scanner scanner = new Scanner(System.in);
        long range1 = scanner.nextLong();
        System.out.println("Enter the upper limit of account numbers:");
        long range2 = scanner.nextLong();
        System.out.println("3//////////////////////////////////////");
        for (int i = 0; i <= trains.length; i++) {
            if (trains[i].getTrain_number() >= range1 && trains[i].getTrain_number() <= range2)
                System.out.println(trains[i].toString());
        }

    }

    public void printAll() {
        System.out.println("4//////////////////////////////////////");
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }

    }

}