package library;

import java.util.HashSet;

public class Rafts {

    private HashSet<Books> booksHashSet = new HashSet<Books>();

    public HashSet<Books> getBooksHashSet() {
        return booksHashSet;
    }

    public void setBooksHashSet(HashSet<Books> booksHashSet) {
        this.booksHashSet = booksHashSet;
    }

    public void addToBooksHashSet(Books s) {
        this.booksHashSet.add(s);
    }
}
