package demo;

import books.Book;
import books.Magazine;
import books.Newspaper;
import books.Readable;
import exception.NotEnoughBooksException;
import library.Personal;
import library.Room;

import java.util.HashSet;
import java.util.Random;

public class Client {

    private String name;
    private HashSet<Readable> booksHashSet = new HashSet<Readable>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public HashSet<Readable> getBooksHashSet() {
        return booksHashSet;
    }

    public void setBooksHashSet(HashSet<Readable> booksHashSet) {
        this.booksHashSet = booksHashSet;
    }

    public void addToBooksHashSet(Readable s) {
        this.booksHashSet.add(s);
    }

    Object getAReadable(HashSet<Readable> booksHashSet) throws NotEnoughBooksException {
        int size = booksHashSet.size();
        int item = new Random().nextInt(size);
        int i = 0;
        for (Object obj : booksHashSet) {
            if (obj == null) {
                throw new NotEnoughBooksException("There are not enough readable in the library");
            }
            if (i == item) return obj;
            i++;
        }
        return null;
    }

    void returnBookToLibrary(Personal personal, HashSet<Readable> libraryBookSet, Room room) {
        System.out.println("The book has been returned to the library: " + personal.getName());
        int size = libraryBookSet.size();
        int item = new Random().nextInt(size);
        int min = 1;
        int max = 3;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (randomNumber == 1) {
            Readable readable = new Book("Book heading", item, room, "Elin Pelin");
            libraryBookSet.add(readable);
        } else if (randomNumber == 2) {
            Readable readable = new Newspaper("Newspaper heading", item, room, "Blagoevgrad");
            libraryBookSet.add(readable);
        } else {
            Readable readable = new Magazine("Magazine heading", item, room, "Another present");
            libraryBookSet.add(readable);
        }
    }
}
