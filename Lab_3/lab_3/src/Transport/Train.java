package Transport;

import java.time.LocalTime;
public class Train extends Transport {
    private int trainNumber;
    private int generalSeats;
    private int compartment;
    private int reservedSeats;
    private int luxurySeats;

    public Train(int id, String destination, LocalTime departureTime, String routeName, int trainNumber,
                 int generalSeats, int compartment, int reservedSeats, int luxurySeats) {
        super(id, destination, departureTime, routeName);
        this.trainNumber = trainNumber;
        this.generalSeats = generalSeats;
        this.compartment = compartment;
        this.reservedSeats = reservedSeats;
        this.luxurySeats = luxurySeats;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getGeneralSeats() {
        return generalSeats;
    }

    public int getCompartment() {
        return compartment;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public int getLuxurySeats() {
        return luxurySeats;
    }
}
