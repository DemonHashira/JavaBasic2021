package library;

import java.util.HashSet;
import java.util.Random;

public class Client {

    private String name;
    private HashSet<Readables> booksHashSet = new HashSet<Readables>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public HashSet<Readables> getBooksHashSet() {
        return booksHashSet;
    }

    public void setBooksHashSet(HashSet<Readables> booksHashSet) {
        this.booksHashSet = booksHashSet;
    }

    public void addToBooksHashSet(Readables s) {
        this.booksHashSet.add(s);
    }

    Object getAReadable(HashSet<Readables> booksHashSet) throws NotEnoughBooksException {
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

    void getAReadable2(HashSet<Readables> booksHashSet) {
        try {
            getAReadable(booksHashSet);
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }
    }

}
