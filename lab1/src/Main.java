import Train.Train;
import java.util.Scanner;
public class Main {
    private Train[] trains;

    public static void main(String[] args) {
        Main main = new Main();

        main.showTrains_heading_to_the_specified_route();
        main.showTrain_namber_();
        main.showShipping_time_();
        main.showNumber_of_seats_();

    }

    public Main() {
        trains = new Train[3];

        trains[0] = new Train(1,"Тернопіль", 12, 8.11);
        trains[1] = new Train();
    }

    public void showTrain_namber_() {
        System.out.println("1//////////////////////////////////////");
        System.out.println("Enter the train number:");
        Scanner scanner = new Scanner(System.in);
        int timeIn = scanner.nextInt();
        for (Train item: trains) {
            if (item.getTrain_number() > timeIn)
                System.out.println(item.toString());
        }
    }

    public void showShipping_time_(){
        System.out.println("2//////////////////////////////////////");
        System.out.println("Enter your arrival time:");
        Scanner scanner = new Scanner(System.in);
        int timeOut = scanner.nextInt();
        for (Train item: trains) {
            if (item.getShipping_time() > timeOut)
                System.out.println(item.toString());
        }
    }
    public void showNumber_of_seats_() {
        System.out.println("3//////////////////////////////////////");
        System.out.println("Enter your arrival time:");
        Scanner scanner = new Scanner(System.in);
        int timeOut = scanner.nextInt();
        for (Train item : trains) {
            if (item.getNumber_of_seats() > timeOut)
                System.out.println(item.toString());
        }
    }
    public void showTrains_heading_to_the_specified_route(){
        System.out.println("Enter the lower limit of account numbers:");
        Scanner scanner = new Scanner(System.in);
        long range1 = scanner.nextLong();
        System.out.println("Enter the upper limit of account numbers:");
        long range2 = scanner.nextLong();
        System.out.println("4//////////////////////////////////////");
        for (int i = 0; i<= trains.length; i++){
            if (trains[i].getAccountNumber()>=range1 && trains[i].getAccountNumber()<=range2)
                System.out.println(trains[i].toString());
        }
    }

    public void printAll(){
        System.out.println("5//////////////////////////////////////");
        for (int i = 0; i< trains.length; i++) {
            System.out.println(trains[i]);
        }

    }
}
