package Sept.ex_04092024;

import java.sql.SQLOutput;

public class Lab003 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        main("Aniket");
        // Calls the overloaded main method with a single String argument
    }

    public static void main(String args) {
        // Overloaded version of the main method that takes a single String argument
        System.out.println("Hello World");
        System.out.println(args); // Print the argument passed, which is "Aniket"

    }

    public void main(int args) {
        // Another overloaded version of the main method that takes an int argument
        System.out.println("Hello World");
    }
}
