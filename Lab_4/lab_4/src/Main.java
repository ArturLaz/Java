import Train.Train;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private Train[] trains;

    public static void main(String[] args) {
        Main main = new Main();

    }

    public Main() {
        trains = new Train[4];

        trains[0] = new Train("Ternopil", 2, "8:42", 12);
        trains[1] = new Train("Lviv", 4, "12:30", 44);
        trains[2] = new Train("Rivne", 3, "7:10", 16);
        trains[3] = new Train("Zhytomyr", 1, "6:30", 21);


        printAll();
        Arrays.sort(trains);
        System.out.println("\n\nAfter sorting by train number");
        printAll();

        System.out.println("\n\nAfter sorting by destination");

        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train tr1, Train tr2) {
                return tr1.getDestination().compareTo(tr2.getDestination());

            }
        });
        printAll();
    }

    public void printAll() {
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
    }
}


