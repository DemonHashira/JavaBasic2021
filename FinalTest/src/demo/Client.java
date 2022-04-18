package demo;

import books.Readable;
import exception.NotEnoughBooksException;
import library.Personal;

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
        for(Object obj : booksHashSet)
        {
            if (obj == null) {
                throw new NotEnoughBooksException("There are not enough readables in the library");
            }
            if (i == item)
                return obj;
            i++;
        }
        return null;
    }

    void returnBookToLibrary(Personal personal) {
        System.out.println("The book has been returned to the library: "
                + personal.getName());
    }

    void getAReadable2(HashSet<Readable> booksHashSet) {
        try {
            getAReadable(booksHashSet);
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }
    }

}
