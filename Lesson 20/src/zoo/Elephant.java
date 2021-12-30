package zoo;

public class Elephant extends Animal{

    @Override
    void makeNoise() {
        System.out.println("Elephant noise");
    }

    @Override
    public String toString() {
        return "This is a elephant";
    }
}
