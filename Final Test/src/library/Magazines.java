package library;

public class Magazines extends Readables{

    private String present;

    Magazines(String heading, int number, Rooms room, String present) {
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
