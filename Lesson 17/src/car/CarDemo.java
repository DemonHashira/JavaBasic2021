package car;

import car.Car;

public class CarDemo {

    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "A8";
        Car.company = "Audi";

        System.out.println(audi.model);
        System.out.println(Car.company);


        Car.company = "Ferrari";
        System.out.println(Car.company);
    }
}
