package books;

import library.Room;

public class Magazine extends Readable {

    private String present;

    public Magazine(String heading, int number, Room room, String present) {
        super(heading, number, room);
        if (present != null && !(present.equals(""))) {
            this.present = present;
        }
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        if (present != null && !(present.equals(""))) {
            this.present = present;
        }
    }
}
