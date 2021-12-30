package vet;

public class Rabbit extends Animal{
    String name;
    String breed;

     Rabbit(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeAnAction() {
        System.out.println("Rabbit jumps");
    }
}
