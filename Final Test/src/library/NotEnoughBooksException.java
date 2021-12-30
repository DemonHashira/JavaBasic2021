package library;

public class NotEnoughBooksException extends Exception{

    NotEnoughBooksException(String message) {
        super(message);
    }
}
