package org.launchcode.java.studios;


import java.util.Scanner;
import static java.lang.Math.*;


public class CircleArea {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please type in the radius of the circle: ");
        double r = s.nextDouble();

        double area = PI * (r * r);
        System.out.println("The area of the circle is " + area);

    }

}
