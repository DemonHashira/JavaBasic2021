package task1;

public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;
    private static final int Working_Hours = 8;
    private static Work workTastks;


    Employee() {};

    Employee(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        this.setCurrentTask(Employee.workTastks.getAquireNextTask());
        Employee.workTastks.setCurrentUnassignedNotFinishedTask();
    }

    public String getName() {
        return name;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public int getHoursLeft() { return hoursLeft; }

    public void setCurrentTask(Task currentTask) {
        if (currentTask == null) {
            return;
        }
        this.currentTask = currentTask;
        this.currentTask.setTaskOwner(this);
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft < 0) {
            return;
        }
        if (hoursLeft > Working_Hours) {
            this.hoursLeft = Working_Hours;
        }

        this.hoursLeft = hoursLeft;
    }
    public void startWorkingDay() {
        this.hoursLeft = Working_Hours;
    }

    public static Work getWorkTastks() {
        return workTastks;
    }

    public static void setWorkTastks (Work workTastks) {
        if (workTastks == null) {
            return;
        }
        Employee.workTastks = workTastks;
    }

    void work() {
        for (int i = 0; i < Employee.workTastks.getWork() ; i++) {
            if (this.hoursLeft != 0) {
                if (this.currentTask != null ) {
                    return;
                }
                this.showReport();
                int hours = this.hoursLeft - this.currentTask.getWorkingHours();

                if (hours > 0) {
                    this.currentTask.toString();
                    this.setHoursLeft(hours);
                    this.currentTask.setWorkingHours(0);
                    this.currentTask.setTaskOwner(null);
                    this.currentTask = null;
                    this.setCurrentTask(Employee.workTastks.getAquireNextTask());
                    Employee.workTastks.setCurrentUnassignedNotFinishedTask();
                } else {
                    this.currentTask.toString();
                    this.currentTask.setWorkingHours(hours * (- 1));
                    this.setHoursLeft(0);
                    this.showReport();
                }
            }
        }
    }

    void showReport() {
        System.out.println("The worker name is: " + this.name);
        System.out.println("The worker " + " " + this.name + " " + " task is " + this.currentTask.getName());
        System.out.println("The worker " + " " + this.name + " " + " hours left are " + this.hoursLeft);
        System.out.println("The worker " + " " + this.name + " " + " task hours left are " + this.currentTask.getWorkingHours());
    }
}
