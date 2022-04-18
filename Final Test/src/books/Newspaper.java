package books;

import library.Room;

public class Newspaper extends Readable {

    private String city;

    public Newspaper(String heading, int number, Room room, String city) {
        super(heading, number, room);
        if (city != null && !(city.equals(""))) {
            this.city = city;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !(city.equals(""))) {
            this.city = city;
        }
    }
}
