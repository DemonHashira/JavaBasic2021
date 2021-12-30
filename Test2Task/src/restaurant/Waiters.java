package restaurant;

public class Waiters {

    String name;

    Waiters() {};

    Waiters (String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }
}
