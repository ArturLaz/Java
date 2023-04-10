package Train;

import java.util.Scanner;

public class Train {
    private String Destination;
    private int Train_number;
    private int Shipping_time;
    private double Number_of_seats;


    public Train () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your destination:");
        Destination = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the train number:");
        Train_number = scanner.nextInt();
        System.out.println("Enter the time of departure:");
        Shipping_time = scanner.nextInt();
        System.out.println("Enter the number, month:");
        Number_of_seats = scanner.nextDouble();
    }
    public Train (int Train_number, String Destination,int Shipping_time,double Number_of_seats){

        this.Destination = Destination;
        this.Train_number = Train_number;
        this.Shipping_time = Shipping_time;
        this.Number_of_seats = Number_of_seats;
    }

    public int getTrain_number(){

        return this.Train_number;
    }

    public String getDestination () {

        return this.Destination;
    }


    public int getShipping_time() {

        return this.Shipping_time;
    }


    public double getNumber_of_seats() {

        return Number_of_seats;
    }

    public String test(){

        return "Train {" + "Destination point = " + Destination + ", Train number = " + Train_number +
                " Time of dispatch = " + Shipping_time + ", Number, month = " + Number_of_seats +"}";
    }


}



