package library;

import books.Readable;
import exception.NotEnoughBooksException;

import java.util.ArrayList;
import java.util.HashSet;

public class Library {

    private String name;
    private ArrayList<Room> roomsArrayList = new ArrayList<>();
    private HashSet<Readable> booksHashSet = new HashSet<>();
    private ArrayList<Personal> personalArrayList = new ArrayList<>();

    public Library(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public ArrayList<Room> getRoomsArrayList() {
        return roomsArrayList;
    }

    public void setRoomsArrayList(ArrayList<Room> roomsArrayList) {
        this.roomsArrayList = roomsArrayList;
    }

    public void addToArrayListRooms(Room s) {
        this.roomsArrayList.add(s);
    }

    public HashSet<Readable> getBooksHashSet() {
        return booksHashSet;
    }

    public void setBooksHashSet(HashSet<Readable> booksHashSet) {
        this.booksHashSet = booksHashSet;
    }

    public void addToHashSetBooks(Readable s) {
        this.booksHashSet.add(s);
    }

    public ArrayList<Personal> getPersonalArrayList() {
        return personalArrayList;
    }

    public void setPersonalArrayList(ArrayList<Personal> personalArrayList) {
        this.personalArrayList = personalArrayList;
    }

    public void addToPersonalArrayList(Personal s) {
        this.personalArrayList.add(s);
    }

    public void removeAReadable(Readable readable) throws NotEnoughBooksException {
        try {
            if (this.getBooksHashSet() == null) {
                throw new NotEnoughBooksException("The library doesn't have any books left");
            }
            this.getBooksHashSet().remove(readable);
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }
    }
}
