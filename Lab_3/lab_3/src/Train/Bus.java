package Train;

public class Bus extends Transport {
    private int totalSeats;

    public Bus(int id, String destination, String departureTime, String routeName, int totalSeats) {
        super(id, destination, departureTime, routeName);
        this.totalSeats = totalSeats;
    }


    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
