import java.util.Arrays;

public class CatDemo {
    public static void main(String[] args) {
        Cat pisan = new Cat();
        Cat pisan2 = new Cat();

        pisan.name = "Pisan senior";
        pisan.age = 18;
        pisan.colour = "Mixed white and black";
        pisan.isMale = true;
        pisan.id = 1512450;
        pisan.mood = "Amused";

        pisan2.name = "Pisan junior";
        pisan2.age = 10;
        pisan2.colour = "Mixed white and black";
        pisan2.isMale = true;
        pisan2.id = 25121574;
        pisan2.mood = "Delighted";

        System.out.println("Pisan senior name is: " + pisan.name);
        System.out.println("Pisan senior age is: " + pisan.age);
        System.out.println("Pisan senior colour is: " + pisan.colour);
        System.out.println("Pisan senior isMale is: " + pisan.isMale);
        System.out.println("Pisan senior id is: " + pisan.id);
        System.out.println("Pisan senior mood is: " + pisan.mood);

        System.out.println();

        System.out.println("Pisan junior name is: " + pisan2.name);
        System.out.println("Pisan junior age is: " + pisan2.age);
        System.out.println("Pisan junior colour is: " + pisan2.colour);
        System.out.println("Pisan junior isMale is: " + pisan2.isMale);
        System.out.println("Pisan junior id is: " + pisan2.id);
        System.out.println("Pisan junior mood is: " + pisan2.mood);

        System.out.println();

        pisan.age = 17;
        pisan.mood = "Astonished";

        pisan2.age = 9;
        pisan2.mood = "Startled";

        System.out.println("Pisan senior age is: " + pisan.age);
        System.out.println("Pisan senior mood is: " + pisan.mood);
        System.out.println("Pisan junior age is: " + pisan2.age);
        System.out.println("Pisan junior mood is: " + pisan2.mood);

        Person2 viktor = new Person2();
        Person2 ivaylo = new Person2();

//        viktor.friend[0] = new Person2();
//        viktor.friend[0].name = "Ivaylo";
//        viktor.friend[1] = new Person2();
//        viktor.friend[1].name = "Kiril";
//
//        ivaylo.friend[0] = new Person2();
//        ivaylo.friend[0].name = "Veneta";
//        ivaylo.friend[1] = new Person2();
//        ivaylo.friend[1].name = "Nikolay";

        viktor.name = "Viktor";
        viktor.age = 17;
        viktor.id = 123123;

        ivaylo.name = "Ivaylo";
        ivaylo.age = 18;
        ivaylo.id = 4551564;

        pisan.owner = viktor;
        pisan2.owner = ivaylo;

        createFriends(viktor.friends);
        createFriends(ivaylo.friends);


//      System.out.println("Pisan owner is " + pisan.owner.name + " and his age is " + pisan.owner.age + "." + " The cat name is " + pisan.name + " and the cat mood is " + pisan.mood);
//      System.out.println("Pisan 2 owner is " + pisan2.owner.name + " and his age is " + pisan2.owner.age + "." + " The cat name is " + pisan2.name + " and the cat mood is " + pisan2.mood);
//      System.out.println("Owner " + pisan.owner.name + " has friends " + viktor.friend[0].name + " and " + viktor.friend[1].name);
//      System.out.println("Owner " + pisan2.owner.name + " has friends " + ivaylo.friend[0].name + " and " + ivaylo.friend[1].name);

        System.out.println();

        System.out.println("Owner friends are: ");

        for (int i = 0; i < viktor.friends.length; i++) {
            System.out.print("At index " + i + " " + viktor.friends[i].name + ",  ");

        }
    }

    public static void createFriends(Person2[] friend) {
        for (int i = 0; i < friend.length; i++) {
            if (i % 2 == 0) {
                friend[i] = new Person2();
                friend[i].name = "Penka";
            } else {
                friend[i] = new Person2();
                friend[i].name = "George";
            }
        }
    }
}

