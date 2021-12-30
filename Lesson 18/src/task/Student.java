package task;

public class Student extends Person{
    private double score;

    Student() {};

    Student (String name, int age, boolean isMale,double score) {
        super(name, age, isMale);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 2 && score <= 6) {
            this.score = score;
        }
    }

     void showStudentInfo() {
        System.out.println("Student name is: " + super.getName() + ".");
        System.out.println("Student " +  super.getName() + " age is: " + super.getAge() + ".");
        System.out.println("Student " +  super.getName() + " sex is: " + super.isMale() + ".");
        System.out.println("Student " +  super.getName() + " mark is: " + this.score + ".");
    }
////    Отговор на въпроса:
//    Възможно е да се получи, защото Student() {}; е default constructor.
//    Ако оставим 2рия конструктор сам програма ще издаде грешка поради причината, че няма default.
}
