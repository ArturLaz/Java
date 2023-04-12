package Transport;
import java.time.LocalTime;
public class Bus extends Transport {
    private int totalSeats;

    public Bus(int id, String destination, LocalTime departureTime, String routeName, int totalSeats) {
        super(id, destination, departureTime, routeName);
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
}
