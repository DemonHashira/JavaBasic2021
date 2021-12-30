package zoo;

public class Zoo {

    Animal[] array = new Animal[10];

    void addAnimal(Animal animal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = animal;
                break;
            }
        }
    }
}

