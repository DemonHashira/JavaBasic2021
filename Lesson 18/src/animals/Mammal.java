package animals;

public class Mammal extends Animal{

    Mammal() {
        super();
        System.out.println("Mammal constructor");
    }

    Mammal(String color) {
        System.out.println("In mammal constructor with color: " + color);
    }
}
