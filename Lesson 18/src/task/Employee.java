package task;

public class Employee extends Person{
    private int daySalary;
    private double hours;

    Employee() {};

    Employee(String name, int age, boolean isMale, int daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public double getHours() {
        return hours;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    double calculateOvertime(double hours) {
        if (super.getAge() <= 18) {
            this.hours = 0;
        } else {
            this.hours = this.daySalary * 1.5;
        }
        return this.hours;
    }

     void showEmployeeInfo() {
        System.out.println("Employee name is: " + super.getName() + ".");
        System.out.println("Employee " +  super.getName() +  " age is: " + super.getAge() + "." );
        System.out.println("Employee " +  super.getName() +  " sex is: " + super.isMale() + ".");
        System.out.println("Employee " +  super.getName() +  " salary is: " + this.daySalary + ".");
    }
}
