package books;

import library.Room;

public class Book extends Readable {

    private String author;

    public Book(String heading, int number, Room room, String author) {
        super(heading, number, room);
        if (author != null && !(author.equals(""))) {
            this.author = author;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !(author.equals(""))) {
            this.author = author;
        }
    }
}
