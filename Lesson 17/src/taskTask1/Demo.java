package taskTask1;

public class Demo {

    public static void main(String[] args) {
        Employee gosho = new Employee("Gosho");
        Employee gencho = new Employee("Gencho");

        Task taskOne = new Task("Study OOP", 7);
        Task taskTwo = new Task("Study OOP again", 8);


        gencho.setHoursLeft(4);
        gencho.setCurrentTask(taskOne);
        gencho.work();

        System.out.println();

        gosho.setHoursLeft(9);
        gosho.setCurrentTask(taskTwo);
        gosho.work();
    }
}
