import Train.Train;

import java.util.Scanner;

public class Main {
    private Train[] trains;

    public static void main(String[] args) {
        Main main = new Main();

        main.showDestination();
        main.showTrain_namber_();
        main.showShipping_time_();
        main.showNumber_of_seats_();

    }

    public Main() {
        trains = new Train[2];

        trains[0] = new Train(1, "Ternopil,ternopil", 12, 8.11);
        trains[1] = new Train();
    }

    public void showDestination() {
        System.out.println("1//////////////////////////////////////");
        System.out.println("Enter the Destination:");
        Scanner scanner = new Scanner(System.in);
        String dest = scanner.nextLine();
        System.out.println(dest.toString());
    }


    public void showTrain_namber_() {

        System.out.println("2//////////////////////////////////////");
        System.out.println("Enter your Train number:");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item : trains) {
            if (item.getTrain_number() > timeIn)
                System.out.println(item.test());
        }
    }

    public void showShipping_time_() {
        System.out.println("3//////////////////////////////////////");
        System.out.println("Enter time of departure :");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item: trains) {
            if (item.getShipping_time() > timeIn)
                System.out.println(item.test());
        }
    }

    public void showNumber_of_seats_() {
        System.out.println("4//////////////////////////////////////");
        System.out.println("Enter number, month:");
        Scanner scanner = new Scanner(System.in);
        double timeIn = scanner.nextDouble();
        for (Train item : trains) {
            if (item.getNumber_of_seats() > timeIn)
                System.out.println(item.test());
        }
    }



}




