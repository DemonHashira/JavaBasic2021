package animals;

public class Animal {
    String name;
    private int age;
    double weight;

    Animal() {
//        System.out.println("Animal constructor");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    void walk() {
        System.out.println("The animal is walking.");
    }

    void breathe() {
        System.out.println("The animal is breathing.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
