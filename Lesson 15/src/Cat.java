public class Cat {

    String name;
    int age;
    String colour;
    boolean isMale;
    long id;
    String mood;
    Person2 owner;

    Cat() {

    }

    Cat (String name, int age ) {
        this.name = name;
        this.age = age;
    }

    Cat (String nameParam, int ageParam, long idParam, String colourParam, boolean isMaleParam, String moodParam, Person2 ownerParam) {
        name = nameParam;
        age = ageParam;
        colour = colourParam;
        isMale = isMaleParam;
        id = idParam;
        mood = moodParam;
        owner = ownerParam;
    }

    void sleep() {
        System.out.println("Cat " + name + " is sleeping. ");
    }

    void meow() {
        System.out.println("Cat " + name + " meows. ");
    }

    void eat() {
        System.out.println("Cat " + name + " eats. ");
    }

    void purr() {
        System.out.println("Cat " + name + " purrs. ");
    }

}
