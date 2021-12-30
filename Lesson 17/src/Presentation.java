public class Presentation {

    public String name;
    private int age;
    boolean isMale;
    protected String mood;

    public int getAge() {
        return age;
    }

    public void setAge() {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }
}
