package restaurant;

public abstract class Client implements IClient {

   abstract Waiters getRandomWaiter(Waiters[] array);

    abstract void makeAnOrder(Menu[] array);

    abstract void receiveTheCheck(Menu[] array);

    abstract void payTheChek(Menu[] array);

}
