package exercises;


import java.util.ArrayList;
import java.util.Scanner;


public class EvenNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Integer newNumber;

        do {
            System.out.println("Enter an integer for the list (or ENTER to finish):");
            newNumber = s.nextInt();
            if (newNumber != null) {
                numbers.add(newNumber);
            }
        } while (newNumber != null);

        System.out.println("Your list: " + numbers);

        for (Integer number : numbers) {
            double d1 = number;
            if (d1 % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("The even numbers in this list: " + evenNumbers);
    }
}
