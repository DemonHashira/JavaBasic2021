package restaurant;

public class Restourant {

    String name;
    String address;
    protected int capital;
    Menu[] menu = new Menu[61];
    Waiters[] waiters = new Waiters[3];

    Restourant() {}

    Restourant(String name, String address, int capital) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (capital > 0) {
            this.capital = capital;
        }
        if (address != null && !(address.equals(""))) {
            this.address = address;
        }
    }

    void showRemaining() {
        for (int i = 0; i < this.menu.length; i++) {
            if (menu[i] != null && menu[i] instanceof MainDishesh || menu[i] instanceof Salads || menu[i] instanceof Deserts) {
                System.out.println(menu[i].dishName);
            } else if (menu[i] != null && menu[i] instanceof AlcoholDrinks || menu[i] instanceof NonAlcoholDrinks) {
                System.out.println(menu[i].drinkName);
            }
        }
    }
}
