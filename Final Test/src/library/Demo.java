package library;

import java.io.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args)  {
        Library library = new Library("Regional library");

        Personal personal = new Personal("Pencho");
        Personal personal2 = new Personal("Gencho");

        Client client = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Rooms room1 = new Rooms();
        Rooms room2 = new Rooms();
        Rooms room3 = new Rooms();

        Rafts raft = new Rafts();
        Rafts raft2 = new Rafts();
        Rafts raft3 = new Rafts();
        Rafts raft4 = new Rafts();
        Rafts raft5 = new Rafts();

        room1.addToRaftsArrayList(raft);
        room1.addToRaftsArrayList(raft2);
        room1.addToRaftsArrayList(raft3);
        room1.addToRaftsArrayList(raft4);
        room1.addToRaftsArrayList(raft5);

        final String heading = "Book heading";
        for (int i = 1; i <= 20; i++) {
            Readables books = new Books(heading + " " + i, i,room1, "Elin Pelin");
            library.addToHashSetBooks(books);
        }

        final String headingNewsPaper = "Newspaper heading";
        for (int i = 1; i <= 10; i++) {
            Readables newspapers = new Newspapers(headingNewsPaper + " " + i, i,room1, "Blagoevgrad");
            library.addToHashSetBooks(newspapers);
        }

        final String headingMagazine = "Magazine heading";
        for (int i = 1; i <= 10; i++) {
            Readables magazines = new Magazines(headingMagazine + " " + i, i,room1, "Another magazine");
            library.addToHashSetBooks(magazines);
        }

        client.setBooksHashSet(library.getBooksHashSet());
        client.getAReadable2(library.getBooksHashSet());
        try {
            library.removeAReadable((Readables) client.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        client2.setBooksHashSet(library.getBooksHashSet());
        client2.getAReadable2(library.getBooksHashSet());
        client2.getAReadable2(library.getBooksHashSet());
        try {
            library.removeAReadable((Readables) client2.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        client3.setBooksHashSet(library.getBooksHashSet());
        client3.getAReadable2(library.getBooksHashSet());
        client3.getAReadable2(library.getBooksHashSet());
        client3.getAReadable2(library.getBooksHashSet());
        try {
            library.removeAReadable((Readables) client3.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        try {
            library.removeAReadable((Readables) client3.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        client.returnBookToLibrary(personal);
        client2.returnBookToLibrary(personal2);
        System.out.println();

        File file = new File("Remaining books in the library.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("Remaining books in the library.txt"), true);
            printStream.append("The remaining readables in the library are: " + "\n");
            for (Readables temp : library.getBooksHashSet()) {
                printStream.append(temp.getHeading() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert sc != null;
            if (!sc.hasNextLine()) break;
            System.out.println(sc.nextLine());
        }
    }
}
