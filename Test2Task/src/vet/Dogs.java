package vet;

public class Dogs extends Animal {
    String name;
    String breed;

    Dogs(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeAnAction() {
        System.out.println("Dog barks");
    }
}
