
public class Person2 {
    String name;
    int age;
    int id;
    String sex;
    double weight;
    Person2[] friends = new Person2[3];

    Person2() {
    }

    Person2 (String nameParam, int ageParam, int idParam, String sexParam, double weightParam, Person2[] friendsParam) {
        name = nameParam;
        age = ageParam;
        id = idParam;
        sex = sexParam;
        weight = weightParam;
        friends = friendsParam;
    }

    Person2(int age) {
        this();
        this.age = age;
    }

    Person2 (String name, int age) {
        this(age);
        this.name = name;
    }

    Person2 (String name, int age, double weight) {
        this(name, age);
        this.weight = weight;
    }

    void eat() {
        System.out.println("Person " + name + " eats");
    }

    void walk() {
        System.out.println("Person " + name + " walks");
    }

    int growUp() {
        return ++age;
    }

    void drinkWater (double litters) {
        System.out.println("Person " + name + " drinks " + litters + " water. ");
    }

    void saySomething() {
        System.out.println("Person " + name + " says something. ");
    }

    void pet() {
        System.out.println("Person " + name + " is petting a cat ");
    }

    void goOnAWalk() {
        System.out.println("Person " + name + " goes on a walk ");
    }

    void makeFriend(Person2 friend, int index) {
        if (index < 0 || index > 9) {
            System.out.println("Index out of boundaries");
        }
        friends[index] = friend;
    }

    void listFriends() {
        for (int i = 0; i < friends.length; i++) {
            if (i % 2 == 0) {
                friends[i] = new Person2();
                friends[i].name = "Penka";
            } else {
                friends[i] = new Person2();
                friends[i].name = "George";
            }
        }
        for (int i = 0; i < friends.length; i++) {
            System.out.print("At index " + i + " " + friends[i].name + ",  ");
        }
    }

    boolean isPersonHasFriends() {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != null) {
                return true;
            }
        }
        return false;
    }
}
