package task1;

public class Demo {
    public static void main(String[] args) {

        Task task1 = new Task("Study OOP", 6);
        Task task2 = new Task("Study OOP again", 5);
        Task task3 = new Task("Study OOP again but thoroughly", 6);

        Work work = new Work();
        work.setWork(5);
        work.setAquireNextTask(task1);
        work.setAquireNextTask(task2);
        work.setAquireNextTask(task3);
        Employee.setWorkTastks(work);

        Employee viktor = new Employee("Viktor");
        Employee ivaylo = new Employee("Ivaylo");

        viktor.startWorkingDay();
        viktor.setCurrentTask(task1);
        viktor.setHoursLeft(8);
        viktor.work();
        viktor.showReport();
    }
}
