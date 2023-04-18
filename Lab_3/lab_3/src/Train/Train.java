package Train;

import java.util.Scanner;
public class Train extends Transport {
    private int trainNumber;
    private int totalSeats;
    private int coupeSeats;
    private int reservedSeats;
    private int luxurySeats;

    public Train(int id, String destination, String departureTime, String routeName, int trainNumber, int totalSeats, int coupeSeats, int reservedSeats, int luxurySeats) {
        super(id, destination, departureTime, routeName);
        this.trainNumber = trainNumber;
        this.totalSeats = totalSeats;
        this.coupeSeats = coupeSeats;
        this.reservedSeats = reservedSeats;
        this.luxurySeats = luxurySeats;
    }


    public int getTrainNumber() {
        return trainNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getCoupeSeats() {
        return coupeSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public int getLuxurySeats() {
        return luxurySeats;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setCoupeSeats(int coupeSeats) {
        this.coupeSeats = coupeSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public void setLuxurySeats(int luxurySeats) {
        this.luxurySeats = luxurySeats;
    }
}



