package vet;

public class Cats extends Animal{
    String name;
    String breed;

     Cats(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeAnAction() {
        System.out.println("Meow, meow");
    }
}
