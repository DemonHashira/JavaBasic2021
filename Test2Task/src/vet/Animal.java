package vet;

public abstract class Animal {
    String name;
    String breed;

     Animal(String name, String breed) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (breed != null && !(breed.equals(""))) {
            this.breed = breed;
        }
    }
    abstract void makeAnAction();
}
