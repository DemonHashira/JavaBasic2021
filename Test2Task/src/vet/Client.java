package vet;

import java.util.Random;

public class Client {

    String name;
    Animal animal;
    String check;
    int money;
    int moneyForCheck;
    int[] checkersArray = new int[3];

    Client(){};

   Client(String name, Animal animal, int money) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        this.animal = animal;
        if (money > 0) {
            this.money = money;
        }
    }

    void getCheck(int[] array, Client client) {
       try {
           checkMoney(client,array);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

     void checkMoney(Client client, int[] array) throws OutOfMoneyException {
        if (client.money <= 0) {
            throw new OutOfMoneyException("Client does not have enough money");
        } else {
            int rnd = new Random().nextInt(array.length);
            if (rnd == 0) {
                this.check = "Prophylactic examination ";
                this.moneyForCheck = 50;
                this.money -= this.moneyForCheck;
            } else if (rnd == 1) {
                this.check = "Emergency case";
                this.moneyForCheck = 150;
                this.money -= this.moneyForCheck;
            } else {
                this.check = "Planned operations";
                this.moneyForCheck = 500;
                this.money -= this.moneyForCheck;
            }
        }
    }
}
