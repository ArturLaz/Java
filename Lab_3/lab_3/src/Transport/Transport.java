package Transport;

import java.time.LocalTime;
public class Transport {
    protected int id;
    protected String destination;
    protected LocalTime departureTime;
    protected String routeName;

    public Transport(int id, String destination, LocalTime departureTime, String routeName) {
        this.id = id;
        this.destination = destination;
        this.departureTime = departureTime;
        this.routeName = routeName;
    }

    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getRouteName() {
        return routeName;
    }
}



