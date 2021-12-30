package library;

public abstract class Readables {

    private String heading;
    private int number;
    private Rooms room;

    Readables(String heading, int number, Rooms room) {
        if (heading != null && !(heading.equals(""))) {
            this.heading = heading;
        }
        if (room != null) {
            this.room = room;
        }
        if (number > 0) {
            this.number = number;
        }
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        if (heading != null && !(heading.equals(""))) {
            this.heading = heading;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        if (room != null) {
            this.room = room;
        }
    }
}
