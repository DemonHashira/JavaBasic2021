package zoo;

public class Demo {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal tiger = new Tiger();
        Animal tiger2 = new Tiger();
        tiger.makeNoise();
        tiger2.makeNoise();

        Animal giraffe = new Giraffe();
        Animal giraffe2 = new Giraffe();
        giraffe.makeNoise();
        giraffe.makeNoise();

        Animal elephant = new Elephant();
        Animal elephant2 = new Elephant();
        elephant.makeNoise();
        elephant.makeNoise();

        zoo.addAnimal(tiger);
        zoo.addAnimal(tiger2);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(giraffe2);
        zoo.addAnimal(elephant);
        zoo.addAnimal(elephant2);

        for (int i = 0; i < zoo.array.length; i++) {
            if (zoo.array[i] != null) {
                System.out.println(zoo.array[i].toString());
            }
        }
    }
}
