package restaurant;

public class Demo extends Restourant {
    public static void main(String[] args) {

        Restourant lozata = new Restourant("Lozata","Elenovo",1000);

        Waiters waiter1 = new Waiters("Ivan");
        Waiters waiter2 = new Waiters("Ivaylo");
        Waiters waiter3 = new Waiters("Kiril");

        lozata.waiters[0] = waiter1;
        lozata.waiters[1] = waiter2;
        lozata.waiters[2] = waiter3;

        ClientStudent student = new ClientStudent(20);
        ClientStudent student2 = new ClientStudent(20);
        ClientStudent student3 = new ClientStudent(20);
        ClientStudent student4 = new ClientStudent(20);

        ClientProgrammer programmer = new ClientProgrammer(50);
        ClientProgrammer programmer2 = new ClientProgrammer(50);
        ClientProgrammer programmer3 = new ClientProgrammer(50);
        ClientProgrammer programmer4 = new ClientProgrammer(50);
        ClientProgrammer programmer5 = new ClientProgrammer(50);
        ClientProgrammer programmer6 = new ClientProgrammer(50);

        for (int i = 1; i < lozata.menu.length; i++) {
            if (i <= 5) {
                lozata.menu[i] = new Salads();
                lozata.menu[i].dishName = "Caesar Salad";
                lozata.menu[i].dishPrice = 10;
                lozata.menu[i].dishGramaj = 300;
            } else if (i <= 10) {
                lozata.menu[i] = new Salads();
                lozata.menu[i].dishName = "Greek Salad";
                lozata.menu[i].dishPrice = 10;
                lozata.menu[i].dishGramaj = 350;
            } else if (i <= 15) {
                lozata.menu[i] = new MainDishesh();
                lozata.menu[i].dishName = "Beef Enchiladas";
                lozata.menu[i].dishPrice = 20;
                lozata.menu[i].dishGramaj = 600;
            } else if (i <= 20) {
                lozata.menu[i] = new MainDishesh();
                lozata.menu[i].dishName = "Favorite Meatloaf";
                lozata.menu[i].dishPrice = 20;
                lozata.menu[i].dishGramaj = 690;
            } else if (i <= 25) {
                lozata.menu[i] = new Deserts();
                lozata.menu[i].dishName = "Tiramisu";
                lozata.menu[i].dishPrice = 8;
                lozata.menu[i].dishGramaj = 160;
            } else if (i <= 30) {
                lozata.menu[i] = new Deserts();
                lozata.menu[i].dishName = "Cheesecake";
                lozata.menu[i].dishPrice = 8;
                lozata.menu[i].dishGramaj = 150;
            } else if (i <= 35) {
                lozata.menu[i] = new AlcoholDrinks();
                lozata.menu[i].drinkName = "Whiskey";
                lozata.menu[i].drinkPrice = 15;
            } else if (i <= 40) {
                lozata.menu[i] = new AlcoholDrinks();
                lozata.menu[i].drinkName = "Rakija";
                lozata.menu[i].drinkPrice = 15;
            } else if (i <= 45) {
                lozata.menu[i] = new AlcoholDrinks();
                lozata.menu[i].drinkName = "Beer";
                lozata.menu[i].drinkPrice = 15;
            } else if (i <= 50) {
                lozata.menu[i] = new NonAlcoholDrinks();
                lozata.menu[i].drinkName = "Coca-Cola";
                lozata.menu[i].drinkPrice = 4;
            } else if (i <= 55) {
                lozata.menu[i] = new NonAlcoholDrinks();
                lozata.menu[i].drinkName = "Fanta";
                lozata.menu[i].drinkPrice = 4;
            } else {
                lozata.menu[i] = new NonAlcoholDrinks();
                lozata.menu[i].drinkName = "Juice";
                lozata.menu[i].drinkPrice = 4;
            }
        }

        student.getRandomWaiter(lozata.waiters);
        student.makeAnOrder(lozata.menu);
        student.receiveTheCheck(lozata.menu);
        student.payTheChek(lozata.menu);
        lozata.capital += student.payMoney;

        student2.getRandomWaiter(lozata.waiters);
        student2.makeAnOrder(lozata.menu);
        student2.receiveTheCheck(lozata.menu);
        student2.payTheChek(lozata.menu);
        lozata.capital += student2.payMoney;

        student3.getRandomWaiter(lozata.waiters);
        student3.makeAnOrder(lozata.menu);
        student3.receiveTheCheck(lozata.menu);
        student3.payTheChek(lozata.menu);
        lozata.capital += student3.payMoney;

        student4.getRandomWaiter(lozata.waiters);
        student4.makeAnOrder(lozata.menu);
        student4.receiveTheCheck(lozata.menu);
        student4.payTheChek(lozata.menu);
        lozata.capital += student4.payMoney;

        programmer.getRandomWaiter(lozata.waiters);
        programmer.makeAnOrder(lozata.menu);
        programmer.receiveTheCheck(lozata.menu);
        programmer.payTheChek(lozata.menu);
        lozata.capital += programmer.payMoney;

        programmer2.getRandomWaiter(lozata.waiters);
        programmer2.makeAnOrder(lozata.menu);
        programmer2.receiveTheCheck(lozata.menu);
        programmer2.payTheChek(lozata.menu);
        lozata.capital += programmer2.payMoney;

        programmer3.getRandomWaiter(lozata.waiters);
        programmer3.makeAnOrder(lozata.menu);
        programmer3.receiveTheCheck(lozata.menu);
        programmer3.payTheChek(lozata.menu);
        lozata.capital += programmer3.payMoney;

        programmer4.getRandomWaiter(lozata.waiters);
        programmer4.makeAnOrder(lozata.menu);
        programmer4.receiveTheCheck(lozata.menu);
        programmer4.payTheChek(lozata.menu);
        lozata.capital += programmer4.payMoney;

        programmer5.getRandomWaiter(lozata.waiters);
        programmer5.makeAnOrder(lozata.menu);
        programmer5.receiveTheCheck(lozata.menu);
        programmer5.payTheChek(lozata.menu);
        lozata.capital += programmer5.payMoney;

        programmer6.getRandomWaiter(lozata.waiters);
        programmer6.makeAnOrder(lozata.menu);
        programmer6.receiveTheCheck(lozata.menu);
        programmer6.payTheChek(lozata.menu);
        lozata.capital += programmer6.payMoney;

        System.out.println("The restaurant " + lozata.name + " balance is: " + lozata.capital);
        System.out.println();
        System.out.println("The remaining products in the restaurant are:");
        lozata.showRemaining();
    }
}