package animal;

public class Cat extends Animal{
    Cat() {}
    Cat(boolean isMammal) {
        super(isMammal);
    }
    @Override
    void makeSomeNoice() {
        System.out.println("meow meow");
    }

    @Override
    public void move() {
        System.out.println("Sneaking");
    }
}
