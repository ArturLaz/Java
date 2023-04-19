package Train;


public class Train implements Comparable<Train> {
    private final String destination;
    private final int trainNumber;
    private final String departureTime;
    private final int seats;

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

    @Override

    public int compareTo(Train o) {
        return this.trainNumber - o.trainNumber;
    }

    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime='" + departureTime + '\'' +
                ", seats=" + seats +
                '}';
    }
}