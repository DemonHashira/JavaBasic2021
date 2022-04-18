package books;

import library.Room;

public abstract class Readable {

    private String heading;
    private int number;
    private Room room;

    Readable(String heading, int number, Room room) {
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        if (room != null) {
            this.room = room;
        }
    }
}
