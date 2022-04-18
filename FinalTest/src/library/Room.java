package library;

import java.util.ArrayList;

public class Room {

    private ArrayList<Raft> raftsArrayList = new ArrayList<Raft>();
    private int number;

    public ArrayList<Raft> getRaftsArrayList() {
        return raftsArrayList;
    }

    public void setRaftsArrayList(ArrayList<Raft> raftsArrayList) {
        this.raftsArrayList = raftsArrayList;
    }

    public void addToRaftsArrayList(Raft s) {
        this.raftsArrayList.add(s);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
