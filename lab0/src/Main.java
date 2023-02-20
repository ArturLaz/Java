import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x;
        double y;
        double z;
        double C;
        double f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть х: ");
        x = scanner.nextDouble();
        System.out.println("Введіть y: ");
        y = scanner.nextDouble();
        System.out.println("Введіть z: ");
        z = scanner.nextDouble();


        C=Math.abs(Math.pow(x,y/x)-Math.pow(Math.sqrt(y/x),1/3));

        f=(y-x)*y-z/(y-x)/1+Math.pow((y-x),2);

        System.out.println("C="+C);
        System.out.println("f="+f);
    }
}