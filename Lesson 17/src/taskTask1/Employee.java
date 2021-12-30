package taskTask1;

public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;

    Employee() {
    }

    Employee(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public void setCurrentTask(Task currentTask) {
        if (currentTask != null) {
            this.currentTask = currentTask;
        }
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft >= 0) {
            this.hoursLeft = hoursLeft;
        }
    }
    void showReport() {
        System.out.println("The worker name is: " + this.getName());
        System.out.println("The worker " +  this.name +  " task is " + this.currentTask.getName());
        System.out.println("The worker " +  this.name +  " hours left are " + this.hoursLeft);
        System.out.println("The worker " +  this.name +  " task hours left are " + this.currentTask.getWorkingHours());
    }

    void work() {
        if (this.hoursLeft == 0 || this.currentTask == null) {
            return;
        }
            int hours = this.hoursLeft - this.currentTask.getWorkingHours();

            if (hours > 0) {
                this.hoursLeft = hours;
                this.currentTask.setWorkingHours(0);
            } else {
                this.hoursLeft = 0;
                this.currentTask.setWorkingHours(hours * (- 1));
            }
       this.showReport();
    }
}
