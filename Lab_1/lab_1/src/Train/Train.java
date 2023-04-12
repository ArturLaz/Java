package Train;

import java.util.ArrayList;
public class Train {

    private String destination;
    private int number;
    private int departureTime;
    private int totalSeats;
    private int coupeSeats;
    private int platskartSeats;
    private int luxeSeats;

    public Train(String destination, int number, int departureTime, int totalSeats, int coupeSeats, int platskartSeats, int luxeSeats) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
        this.totalSeats = totalSeats;
        this.coupeSeats = coupeSeats;
        this.platskartSeats = platskartSeats;
        this.luxeSeats = luxeSeats;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getCoupeSeats() {
        return coupeSeats;
    }

    public int getPlatskartSeats() {
        return platskartSeats;
    }

    public int getLuxeSeats() {
        return luxeSeats;
    }
}
