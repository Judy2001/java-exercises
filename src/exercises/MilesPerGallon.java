package exercises;


import java.util.Scanner;


public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please type in the number of miles you have driven:");
        double m = s.nextDouble();
        System.out.println("Please type in the the amount of gas you have used (in gallons):");
        double g = s.nextDouble();

        double milesPerGallon = m / g;
        System.out.println("Your gas mileage is " + milesPerGallon);
    }
}
