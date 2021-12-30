package animal;

public class Demo {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal syberianCat = new SyberianCat();
        Animal bird = new Bird();
        Bird bird2 = new Bird();

        System.out.println("Cat is moving ");
        cat.move();
        System.out.println();
        System.out.println("Dog is moving ");
        dog.move();
        System.out.println();
        System.out.println("Syberian cat is moving ");
        syberianCat.move();

    }
}