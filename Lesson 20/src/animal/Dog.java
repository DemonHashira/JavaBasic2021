package animal;

public class Dog extends Animal{
    boolean isMammal;

    Dog(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public Dog() {

    }

    @Override
    void makeSomeNoice() {
        System.out.println("bau, bau");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}
