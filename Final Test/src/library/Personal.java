package library;

public class Personal {

    private String name;

    public Personal(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }
}
