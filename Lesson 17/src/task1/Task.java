package task1;

public class Task {
    private String name;
    private int workingHours;
    private Employee taskOwner;

    Task() {};

    Task(String name, int workingHours) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (workingHours > 0) {
            this.workingHours = workingHours;
        }
    }

    public String getName() {
        return name;
    }

     public int getWorkingHours() {
        return workingHours;
     }

     public void setTaskOwner(Employee taskOwner) {
         if (name != null && !(name.equals(""))) {
             this.taskOwner = taskOwner;
         }
     }
     public void setWorkingHours(int workingHours) {
         if (workingHours > 0) {
             this.workingHours = workingHours;
         }
     }

     public void setName(String name) {
         if (name != null && !(name.equals(""))) {
             this.name = name;
         }
     }
}
