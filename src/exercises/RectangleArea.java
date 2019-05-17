package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please type in the length of the rectangle: ");
        double l = s.nextDouble();
        System.out.println("Please type in the width of the rectangle: ");
        double w = s.nextDouble();

        double area = l * w;
        System.out.println("The area of the rectangle is " + area);
    }
}