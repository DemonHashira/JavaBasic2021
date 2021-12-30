package zoo;

public class Tiger extends Animal{

    @Override
    void makeNoise() {
        System.out.println("roar roar");
    }

    @Override
    public String toString() {
        return "This is a tiger";
    }
}
