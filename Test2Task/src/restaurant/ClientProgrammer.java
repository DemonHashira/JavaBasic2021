package restaurant;
import java.util.Random;

public class ClientProgrammer extends Client{

    int money;
    int receipt;
    int payMoney;

    ClientProgrammer() {};

    ClientProgrammer(int money) {
        if (money == 20 || money == 50) {
            this.money = money;
        }
    }

    @Override
    Waiters getRandomWaiter(Waiters[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    Menu getRandomDrink(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof AlcoholDrinks) {
            return array[rnd];
        }
        return getRandomDrink(array);
    }

    void removeDrink(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof AlcoholDrinks) {
            array[rnd] = null;
        } else {
            removeDrink(array);
        }
    }

    void removeDish(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof MainDishesh) {
            array[rnd] = null;
        } else {
            removeDish(array);
        }
    }

    Menu getRandomDish(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof MainDishesh) {
            return array[rnd];
        }
        return getRandomDish(array);
    }

    @Override
    void makeAnOrder(Menu[] array) {
        if (this.money >= 40 && getRandomDish(array) != null && getRandomDrink(array) != null) {
            getRandomDish(array);
            getRandomDrink(array);
            removeDish(array);
            removeDrink(array);
            this.money = 15;
        }
    }

    @Override
    void receiveTheCheck(Menu[] array) {
        this.receipt = 35;
    }

    @Override
    void payTheChek(Menu[] array) {
        this.payMoney = this.receipt;
    }
}