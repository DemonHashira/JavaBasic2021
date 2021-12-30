package library;

public class Books extends Readables{

    private String author;

    Books(String heading, int number, Rooms room, String author) {
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
