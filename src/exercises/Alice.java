package exercises;


import java.util.Scanner;


public class Alice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";

        System.out.println("Please type in a term you would like to search for in the first sentence of 'Alice's " +
                "Adventures in Wonderland:'");
        String searchTerm = s.nextLine();

        boolean isFound = firstSentence.contains(searchTerm);
        if (isFound) {
            System.out.println("Your term '" + searchTerm + "' appears in the sentence.");
        } else {
            System.out.println("Your term '" + searchTerm + "' does not appear in the sentence.");
        }
    }
}
