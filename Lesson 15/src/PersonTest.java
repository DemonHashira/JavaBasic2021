public class PersonTest {
    public static void main(String[] args) {
        Person ivan = new Person();
        Person ani = new Person();

        System.out.println(ivan);
        System.out.println(ani);

        ivan.name = "Ivan";
        ivan.age = 55;
        ivan.personalNumber = 1205120021;
        ivan.weight = 80.5;

        ani.name = "Anna";
        ani.age = 55;

        System.out.println(ivan.name);
        System.out.println(ani.name);
    }
}
