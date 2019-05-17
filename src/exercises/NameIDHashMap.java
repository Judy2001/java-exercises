package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameIDHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        int newID = 0;
        do {

            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                newID = newID + 1;
                students.put(newID, newStudent);

            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }

}