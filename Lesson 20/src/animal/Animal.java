package animal;

public abstract class Animal {
    boolean isMammal;

    Animal() {}

    Animal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    abstract void makeSomeNoice();

    boolean isMammal() {
        return this.isMammal;
    }

    public abstract void move();
}
