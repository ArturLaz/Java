package train;
import Main;
import java.util.Scanner;
public class Train {
    private String destination;//Пункт призначення
    private int trainNumber;//Номер поїзда
    private String departureTime;//Час відправлення
    private int seats;//Кількість місць

    public Train {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the destination :");
        destination = scanner.nextLine();
        System.out.println("Enter the train number:");
        trainNumber = (int) scanner.nextLong();
        System.out.println("Specify the time of departure: :");
        departureTime = scanner.nextLine();
        System.out.println("Specify the number of seats:");
        seats = (int) scanner.nextLong();
    }
    public Train(String destination, int trainNumber, String departureTime, int seats) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.seats = seats;
    }
    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getSeats() {
        return seats;
    }

    public String toString(){
        return "Phone {" + "Destination = " + destination + ", Train Number = " + trainNumber +
                ", Departure time = " + departureTime +  ", Seats = " + seats + "}";
    }
}
