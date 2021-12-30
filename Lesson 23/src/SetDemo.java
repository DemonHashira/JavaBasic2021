import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        TreeSet<Car> uniqueCars = new TreeSet<>();
        uniqueCars.add(new Car("Lambo","123"));
        uniqueCars.add(new Car("nissan","12334"));
        uniqueCars.add(new Car("skoda","123341"));
        uniqueCars.add(new Car("opel","12fsd3"));
        uniqueCars.add(new Car("Lambo","12312f"));

        for (Car car : uniqueCars) {
            System.out.println(car.toString());
        }

    }
}
