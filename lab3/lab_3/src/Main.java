import Train.Train;

import java.util.Scanner;

public class Main {
    private Train[] trains;

    public static void main(String[] args) {
        Main main = new Main();

        main.showDestination();
        main.showTrainNamber();
        main.showShippingTime();
        main.showNumberOfSeats();
        main.displayAll();

    }

    public Main() {
        trains = new Train[2];

        trains[0] = new Train(1, "Ternopil", 12, 8.11);
        trains[1] = new Train();
    }

    public void showDestination() {
        System.out.println("Enter the Destination:");
        Scanner scanner = new Scanner(System.in);
        String dest = scanner.nextLine();
    }


    public void showTrainNamber() {

        System.out.println("Enter your Train number:");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item : trains) {
            if (item.getTrain_number() > timeIn)
                System.out.println(item.test());
        }
    }

    public void showShippingTime() {

        System.out.println("Enter time of departure :");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item: trains) {
            if (item.getShipping_time() > timeIn)
                System.out.println(item.test());
        }
    }

    public void showNumberOfSeats() {

        System.out.println("Enter number, month:");
        Scanner scanner = new Scanner(System.in);
        double timeIn = scanner.nextDouble();
        for (Train item : trains) {
            if (item.getNumber_of_seats() > timeIn)
                System.out.println(item.test());
        }
    }

    public void displayAll(){
        for (int i=0; i< trains.length; i++)
        {
            trains[i].test();
        }
    }

}




