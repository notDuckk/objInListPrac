package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ANIMAL PORTION -----------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
//        ArrayList<Animal> myList = new ArrayList<>();
//
//
//        System.out.println("Animal Menu");
//        System.out.println("Entering nothing will stop the loop.");
//        while (true) {
//            System.out.println("Please enter a name: ");
//            String name = input.nextLine();
//            if (name.isEmpty()) {
//                break;
//            }
//            // I had to put this here otherwise it would rint out even when the loop was broken
//            System.out.println("Is it a dog? Yes or No: ");
//            String answer = input.nextLine();
//            Boolean ansBool = Boolean.parseBoolean(answer);
//            // If statement to verify if they typed a valid option
//            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("No"))) {
//                System.out.println("Please enter a valid option.");
//                System.out.println("Is it a dog? Yes or No: ");
//                answer = input.nextLine();
//                ansBool = Boolean.parseBoolean(answer);
//            }
//            // If statement to give ansBool a value
//            if (answer.equalsIgnoreCase("Yes")) {
//                ansBool = true;
//            } else if (answer.equalsIgnoreCase("No")) {
//                ansBool = false;
//            }
//            // adding the new Animal you created to the list and storing it as an animal object
//            myList.add(new Animal(name,ansBool));
//        }
//        // printing the animals/not animal in the list
//        for (Animal a : myList) {
//            System.out.println(a);
//        }
        // ANIMAL PORTION END ---------------------------------------------------------------------------

        // TV SHOWS PORTION -----------------------------------------------------------------------------
//        ArrayList<TvShow> myTvShows = new ArrayList<>();
//        System.out.println("Tv Show Menu");
//        System.out.println("Entering nothing will stop the loop.");
//
//        while (true) {
//            System.out.println("Please enter a name: ");
//            String name = input.nextLine();
//            if (name.isEmpty()) {
//                break;
//            }
//            System.out.println("How many episodes?");
//            int episodes = input.nextInt();
//            String genre = input.nextLine();
//            if (episodes != 0) {
//                System.out.println("What is the genre?");
//                genre = input.nextLine();
//            }
//
//            myTvShows.add(new TvShow(name,episodes,genre));
//
//
//        }
//        for (TvShow ts : myTvShows) {
//            System.out.println(ts);
//        }
        // TV SHOWS PORTION END ------------------------------------------------------------------------

        // BOOK PORTION --------------------------------------------------------------------------------

        ArrayList<Books> myBooks = new ArrayList<>();

        myBooks.add(new Books("To Kill a Mocking Bird",281,1960));
        myBooks.add(new Books("1984",328,1949));
        myBooks.add(new Books("The Great Gatsby",180,1925));
        myBooks.add(new Books("Moby Dick",585,1851));
        myBooks.add(new Books("Pride and Prejudice",279,1813));


        while (true) {
            System.out.println("What information will be printed?");
            String info = input.nextLine();

            if (info.isEmpty()) {
                break;
            } else if (info.equals("everything")) {
                for (Books book : myBooks) {
                    System.out.println(book);
                }
            } else if (info.equals("name")) {
                for (Books book : myBooks) {
                    System.out.println(book.getTitle());
                }
            }
        }
        // BOOK PORTION END -------------------------------------------------------------------------
    }
}