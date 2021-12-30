package library;

import java.util.ArrayList;

public class Rooms {

    private ArrayList<Rafts> raftsArrayList = new ArrayList<Rafts>();
    private int number;

    public ArrayList<Rafts> getRaftsArrayList() {
        return raftsArrayList;
    }

    public void setRaftsArrayList(ArrayList<Rafts> raftsArrayList) {
        this.raftsArrayList = raftsArrayList;
    }

    public void addToRaftsArrayList(Rafts s) {
        this.raftsArrayList.add(s);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
