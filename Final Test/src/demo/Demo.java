package demo;

import books.Book;
import books.Magazine;
import books.Newspaper;
import books.Readable;
import exception.NotEnoughBooksException;
import library.*;

import java.io.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws NotEnoughBooksException {
        Library library = new Library("Regional library");

        Personal personal = new Personal("Pencho");
        Personal personal2 = new Personal("Gencho");

        Client client = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();

        Raft raft = new Raft();
        Raft raft2 = new Raft();
        Raft raft3 = new Raft();
        Raft raft4 = new Raft();
        Raft raft5 = new Raft();

        room1.addToRaftsArrayList(raft);
        room1.addToRaftsArrayList(raft2);
        room1.addToRaftsArrayList(raft3);
        room1.addToRaftsArrayList(raft4);
        room1.addToRaftsArrayList(raft5);

        final String heading = "Book heading";
        for (int i = 1; i <= 20; i++) {
            Readable books = new Book(heading + " " + i, i, room1, "Elin Pelin");
            library.addToHashSetBooks(books);
        }

        final String headingNewsPaper = "Newspaper heading";
        for (int i = 1; i <= 10; i++) {
            Readable newspapers = new Newspaper(headingNewsPaper + " " + i, i, room1, "Blagoevgrad");
            library.addToHashSetBooks(newspapers);
        }

        final String headingMagazine = "Magazine heading";
        for (int i = 1; i <= 10; i++) {
            Readable magazines = new Magazine(headingMagazine + " " + i, i, room1, "Another magazine");
            library.addToHashSetBooks(magazines);
        }

        client.setBooksHashSet(library.getBooksHashSet());
        client.getAReadable(library.getBooksHashSet());
        try {
            library.removeAReadable((Readable) client.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        client2.setBooksHashSet(library.getBooksHashSet());
        client2.getAReadable(library.getBooksHashSet());
        client2.getAReadable(library.getBooksHashSet());
        try {
            library.removeAReadable((Readable) client2.getAReadable(library.getBooksHashSet()));
            library.removeAReadable((Readable) client2.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        client3.setBooksHashSet(library.getBooksHashSet());
        client3.getAReadable(library.getBooksHashSet());
        client3.getAReadable(library.getBooksHashSet());
        client3.getAReadable(library.getBooksHashSet());
        try {
            library.removeAReadable((Readable) client3.getAReadable(library.getBooksHashSet()));
            library.removeAReadable((Readable) client3.getAReadable(library.getBooksHashSet()));
            library.removeAReadable((Readable) client3.getAReadable(library.getBooksHashSet()));
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }

        client2.returnBookToLibrary(personal2, client.getBooksHashSet(), room1);
        client.returnBookToLibrary(personal, client.getBooksHashSet(), room2);

        System.out.println();

        File file = new File("Remaining books in the library.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("Remaining books in the library.txt"), true);
            printStream.append("The remaining readable in the library are: " + "\n");
            for (Readable temp : library.getBooksHashSet()) {
                printStream.append(temp.getHeading()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int numberBooksRemaining = 0;
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
            numberBooksRemaining++;
        }
        numberBooksRemaining--;
        System.out.println();
        System.out.println("Number of readable: " + numberBooksRemaining);
    }
}
