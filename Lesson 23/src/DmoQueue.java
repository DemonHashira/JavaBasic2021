import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DmoQueue {

    public static void main(String[] args) {

        Queue<String> balls = new LinkedList<>();
        balls.offer("pink ball");
        balls.offer("black ball");
        balls.offer("red ball");
        balls.poll();

        for (String ball : balls) {
            System.out.println(ball.hashCode());
        }
    }
}
