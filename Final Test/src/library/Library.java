package library;

import java.util.ArrayList;
import java.util.HashSet;

public class Library {

    private String name;
    private ArrayList<Rooms> roomsArrayList = new ArrayList<>();
    private HashSet<Readables> booksHashSet = new HashSet<>();
    private ArrayList<Personal> personalArrayList = new ArrayList<>();

    Library(String name) {
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

    public ArrayList<Rooms> getRoomsArrayList() {
        return roomsArrayList;
    }

    public void setRoomsArrayList(ArrayList<Rooms> roomsArrayList) {
        this.roomsArrayList = roomsArrayList;
    }

    public void addToArrayListRooms(Rooms s) {
        this.roomsArrayList.add(s);
    }

    public HashSet<Readables> getBooksHashSet() {
        return booksHashSet;
    }

    public void setBooksHashSet(HashSet<Readables> booksHashSet) {
        this.booksHashSet = booksHashSet;
    }

    public void addToHashSetBooks(Readables s) {
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

    void removeAReadable(Readables readables) throws NotEnoughBooksException{
        try {
            if (this.getBooksHashSet() == null) {
                throw new NotEnoughBooksException("The library doesn't have any books left");
            }
            this.getBooksHashSet().remove(readables);
        } catch (NotEnoughBooksException e) {
            e.printStackTrace();
        }
    }
}
