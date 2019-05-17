package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWords {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> flws = new ArrayList<>();
        String newWord;

        do {
            System.out.println("Enter a word for the list (or ENTER to finish):");
            newWord = s.nextLine();
            if (!newWord.equals("")) {
                words.add(newWord);
            }
        } while (!newWord.equals(""));

        System.out.println("Your list: " + words);

        for (String word : words) {
            if (word.length() == 5) {
                flws.add(word);
            }
        }
        System.out.println("The five-letter words in this list: " + flws);
    }
}