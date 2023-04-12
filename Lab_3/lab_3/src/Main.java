import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів з класів Transport, Train та Bus
        Transport transport1 = new Transport(1, "Львів", LocalTime.of(10, 30), "Львів - Київ");
        Train train1 = new Train(2, "Київ", LocalTime.of(14, 45), "Львів - Київ", 43, 150, 50, 20, 5);
        Bus bus1 = new Bus;
    }
}
