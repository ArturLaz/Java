import train.Train;

import java.util.Scanner;
public class Main {
    private Train[] trains;

    public static void main(String[] args) {
        Main main = new Main();

        main.showDestination();

        main.showDepartureTime();

        main.showSeats();


    }

    public Main() {
        trains = new Train[4];

        trains[0] = new Train("Ternopil", 1, "8:42", 5);
        trains[1] = new Train("Lviv", 3, "12:30", 4);
        trains[2] = new Train("Rivne", 5, "7:10", 6);
        trains[3] = new Train("Zhytomyr", 7, "19:25", 2);

    }

    public void showDestination() {
        System.out.println("Enter filterByDestination:");
        Scanner scanner = new Scanner(System.in);
        String filterByDestination = scanner.nextLine();
        showDestination(filterByDestination);
    }

    public void showDestination(String filterByDestination) {
        for (Train item : trains) {
            if (item.getDestination().equals(filterByDestination))
                System.out.printf(item.toString());
        }

    }
    public void showDepartureTime() {
        System.out.println("Enter Departure time:");
        Scanner scanner = new Scanner(System.in);
        String filterByTime = scanner.nextLine();
        showDestination(filterByTime);
    }

    public void showDepartureTime(String filterByTime) {
        for (Train item : trains) {
            if (item.getDepartureTime().equals(filterByTime))
                System.out.printf(item.toString());
        }
    }

    public void showSeats() {
        System.out.println("Enter seats:");
        Scanner scanner = new Scanner(System.in);
        int filterBySeats = scanner.nextInt();
        scanner.nextLine();
        showSeats (filterBySeats);
    }

    private void showSeats(int filterBySeats) {
        for (Train item : trains) {
            if (item.getSeats() > filterBySeats)
                System.out.println(item);
        }
    }


}
