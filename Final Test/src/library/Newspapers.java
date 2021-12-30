package library;

public class Newspapers extends Readables{

    private String city;

    Newspapers(String heading, int number, Rooms room, String city) {
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
