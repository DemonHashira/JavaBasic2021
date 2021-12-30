package vet;

public class Doctors {

    String name;
    int age;

     Doctors(String name, int age) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (age > 0) {
            this.age = age;
        }
    }
}
