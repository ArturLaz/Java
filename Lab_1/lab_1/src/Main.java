package train;
import Train;

import java.util.Scanner;
public class Main {
    private Train[] trains;
    public static void main(String[] args) {
        Main main = new Main();

        main.showDestination();

        main.showTrainNambet();

        main.showDepartureTime();

        main.showSeats;


    }

    public Main(){
        trains = new Train[][5];

        trains[0] = new Train("Ternopil", 1,"8:42",5);
        trains[1] = new Train("Lviv", 3,"12:30",4);
        trains[2] = new Train("Rivne", 5,"7:10",6);
        trains[3] = new Train("Zhytomyr", 7,"19:25",2);
        trains[4] = new Train();
    }

    public void showDestination(){
        System.out.println("Confirm your destination:");
        Scanner scanner = new Scanner(System.in);
        String dest = String.valueOf(new Scanner(System.lineSeparator()));
        System.out.println(dest.toString());

    }

    public void showTrainNambet() {
        System.out.println("Enter train number:");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item : trains) {
            if (item.getTrainNumber() > timeIn)
                System.out.println(item.toString());
        }

    }

    public void showDepartureTime(){
        System.out.println("Confirm the time of departure:");
        Scanner scanner = new Scanner(System.in);
        String dep = String.valueOf(new Scanner(System.lineSeparator()));
        System.out.println(dep.toString());

    }
    public void showSeats(){
        System.out.println("Enter seats:");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item : trains) {
            if (item.getSeats() > timeIn)
                System.out.println(item.toString());
        }
    }


}