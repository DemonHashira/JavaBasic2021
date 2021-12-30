package restaurant;

import java.util.Random;

public class ClientStudent extends Client{

    int money;
    int receipt;
    int payMoney;

    ClientStudent() {};

    ClientStudent(int money) {
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
        if (array[rnd] instanceof NonAlcoholDrinks) {
            return array[rnd];
        }
        return getRandomDrink(array);
    }

    Menu getRandomDish(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof Salads || array[rnd] instanceof Deserts) {
            return array[rnd];
        }
        return getRandomDish(array);
    }

    void removeDrink(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof NonAlcoholDrinks) {
            array[rnd] = null;
        } else {
            removeDrink(array);
        }
    }

    void removeDish(Menu[] array) {
        int rnd = new Random().nextInt(array.length);
        if (array[rnd] instanceof Salads || array[rnd] instanceof Deserts) {
           array[rnd] = null;
        } else {
            removeDish(array);
        }
    }

    @Override
    void makeAnOrder(Menu[] array) {
        if (this.money >= 16 && getRandomDish(array) != null && getRandomDrink(array) != null) {
            getRandomDish(array);
            getRandomDrink(array);
            removeDish(array);
            removeDrink(array);
            if (getRandomDish(array) instanceof Salads) {
                this.money = 6;
            } else {
                this.money = 8;
            }
        }
    }

    @Override
    void receiveTheCheck(Menu[] array) {
        if (getRandomDish(array) instanceof Salads) {
            this.receipt = 14;
        } else {
            this.receipt = 12;
        }
    }

    @Override
    void payTheChek(Menu[] array) {
        if (getRandomDish(array) instanceof Salads) {
            this.payMoney = 14;
        } else {
            this.payMoney = 12;
        }
    }
}