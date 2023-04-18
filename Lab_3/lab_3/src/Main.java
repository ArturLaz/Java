import Train.*;

    public class Main {
        public static void main(String[] args) {
            Transport[] transports = new Transport[3];

            Train train = new Train(1, "Kyiv", "10:00", "Kyiv - Lviv", 5, 100, 20, 50, 10);
            Bus bus = new Bus(2, "Lviv", "15:00", "Lviv - Kyiv", 50);

            transports[0] = train;
            transports[1] = bus;


            System.out.println("Train " + train.getTrainNumber() + " has " + train.getTotalSeats() + " total seats, " + train.getCoupeSeats() + " coupe seats, " + train.getReservedSeats() + " reserved seats, and " + train.getLuxurySeats() + " luxury seats.");


            System.out.println("Bus has " + bus.getTotalSeats() + " total seats.");

        }
    }


