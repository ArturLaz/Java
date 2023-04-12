import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private double calcC(double x, double y, double z) {
        return(Math.abs(Math.pow(x,y/x)-Math.pow(Math.sqrt(y/x),1/3)));
    }
    private double calcf(double x, double y, double z) {
        return (y-x)*y-z/(y-x)/1+Math.pow((y-x),2);
    }
    private void print(double x, double y, double z, double C, double f) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("////////////////////////////////////////////");
        System.out.println("C = " + C);
        System.out.println("f = " + f);
    }
    private void printDate(Date date){
        System.out.println("////////////////////////////////////////////");
        System.out.printf("%1$tA %1$te %1$tB\n", date);
    }
    private void run() {
        System.out.println("Введіть число x:");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        System.out.println("Введіть число y:");
        double y = s.nextDouble();
        System.out.println("Введіть число z:");
        double z = s.nextDouble();
        double C = calcC(x, y, z);
        double f = calcf(x, y, z);
        print(x, y, z, C, f);
        Date date = new Date();
        printDate(date);
    }
}