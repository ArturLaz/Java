package Train;

public class Transport {
    private int id;
    private String destination;
    private String departureTime;
    private String routeName;

    public Transport(int id, String destination, String departureTime, String routeName) {
        this.id = id;
        this.destination = destination;
        this.departureTime = departureTime;
        this.routeName = routeName;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

}