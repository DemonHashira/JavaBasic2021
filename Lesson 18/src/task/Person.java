package task;

public class Person {
    private String name;
    private int age;
    private boolean isMale;

    Person() {};

    Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    void showPersonInfo() {
        System.out.println("Person name is: " + this.name + ".");
        System.out.println("Person " +  this.name + " age is: " + this.age + ".");
        System.out.println("Person " +  this.name + " sex is: " + this.isMale + ".");
    }
}
