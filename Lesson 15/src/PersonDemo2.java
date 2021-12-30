public class PersonDemo2 {

    public static void main(String[] args) {
        Person2 lili = new Person2();
        lili.name = "Lili";
        lili.age = 20;

        lili.eat();
        lili.drinkWater(2);
        int liliAge = lili.growUp();
        System.out.println("Lili age is " + liliAge);

        lili.walk();

        Person2 sasho = new Person2();
        sasho.age = 66;
        sasho.name = "Sasho";

        int sashoAge = sasho.growUp();
        System.out.println("Sashos age is " + sashoAge);

        Person2 ivan = new Person2();
        ivan.name = "Ivan";
        ivan.age = 17;

//        ivan.makeFriend(ivan, 6);
//        ivan.listFriends();

        Person2 kiril = new Person2();
        Person2 spasimir = new Person2(15);
        Person2 georgi = new Person2("Georgi", 16);
        Person2 nikolay = new Person2("Nikolay", 17,66);

        System.out.println();

        System.out.println(kiril);
        System.out.println(spasimir.age);
        System.out.println(georgi.name + " " + georgi.age);
        System.out.println(nikolay.name + " " + nikolay.age + " " + nikolay.weight);

        boolean isLisiHasFriends = lili.isPersonHasFriends();
        System.out.println(isLisiHasFriends);

    }
}
