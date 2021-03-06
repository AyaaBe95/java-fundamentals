/*
 * This Java source file was generated by the Gradle 'init' task.
 */


package basics;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

         System.out.println(pluralize("rrrr", 3));
         flipNHeads(2);
        clock();


    }

    public static String pluralize(String word, int num) {

        if (num == 0 || num > 1) {
            return "I own " + num + " " + word + "s.";
        }
        return "I own " + num + " " + word + ".";
    }

    public static void flipNHeads(int n) {
        int headsCounter = 0;
        int totalCounter = 0;

        while (n != headsCounter) {
            double randomNum = Math.random();
            if (randomNum > .5) {
                headsCounter++;
                System.out.println("heads");

            } else {
                headsCounter = 0;
                System.out.println("tails");

            }
            totalCounter++;


        }

        System.out.println("It took " + totalCounter + " flips to flip " + n + " heads in a row.");

    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();

        while (true) {

            if (LocalDateTime.now().getSecond() != now.getSecond()) {
                LocalDateTime current = LocalDateTime.now();
                String time = current.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                System.out.println(time);
                now = LocalDateTime.now();

            }


        }


    }
}
