package zoo;

public class Giraffe extends Animal{

    @Override
    void makeNoise() {
        System.out.println("Giraffe noise");
    }

    @Override
    public String toString() {
        return "This is a giraffe";
    }
}
