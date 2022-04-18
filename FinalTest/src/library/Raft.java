package library;

import books.Book;

import java.util.HashSet;

public class Raft {

    private HashSet<Book> booksHashSet = new HashSet<Book>();

    public HashSet<Book> getBooksHashSet() {
        return booksHashSet;
    }

    public void setBooksHashSet(HashSet<Book> booksHashSet) {
        this.booksHashSet = booksHashSet;
    }

    public void addToBooksHashSet(Book s) {
        this.booksHashSet.add(s);
    }
}
