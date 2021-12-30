package animals;

public class AnimalDemo {

    public static void main(String[] args) {
        Cat foxy = new Cat();
        Cat ray = new Cat();
        Bird birdy = new Bird();

        foxy.climb();
        ray.climb();
        birdy.fly();
        birdy.setAge(2);
        System.out.println("Birdy age: " + birdy.getAge());

        Animal animal = new Animal();
        animal.breathe();


    }
}
