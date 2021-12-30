import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoCar {

    public static void main(String[] args) {

//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("BMW"));
//        cars.add(new Car("Lada"));
//
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i).getModel());
//        }

//        LinkedList<Car> linkedCars = new LinkedList<>();
//        linkedCars.addFirst(new Car("AUDI"));
//        linkedCars.addFirst(new Car("Reno"));
//        linkedCars.add(new Car("Ferrari"));
//        linkedCars.addFirst(new Car("Toyota"));

        Stack<String> flower = new Stack<>();
        flower.push("cactus");

        flower.push("rose");
        flower.pop();
        flower.push("orchid");


        for (String flowers : flower) {
            System.out.println(flowers);
        }

    }
}
