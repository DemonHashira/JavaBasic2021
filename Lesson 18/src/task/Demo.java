package task;

public class Demo {

    public static void main(String[] args) {
        Person[] people = new Person[10];
        Person pesho = new Person("Pesho",18, true);
        Student gosho = new Student("Gosho", 18, true, 5);
        Employee gencho = new Employee("Gencho", 19, true, 1000);

        for (int i = 0; i < people.length; i++) {
            if (i == 0 || i == 1) {
                people[i] = new Person();
                people[i].setName("Pesho");
            } else if (i == 2 || i == 3) {
                people[i] = new Student();
                people[i].setName("Gosho");
            } else if (i == 4 || i == 5) {
                people[i] = new Employee();
                people[i].setName("Gencho");
            }
        }

        for (Person value : people) {
            if (value == null) {
                break;
            }
            switch (value.getName()) {
                case "Pesho" -> {
                    pesho.showPersonInfo();
                    System.out.println();
                }
                case "Gosho" -> {
                    gosho.showStudentInfo();
                    System.out.println();
                }
                case "Gencho" -> {
                    gencho.showEmployeeInfo();
                    System.out.println();
                }
            }
        }

        for (Person person : people) {
            if (person == null) {
                break;
            }
            if (person.getName().equals("Gencho")) {
                System.out.println("The employee overtime sum is: " + gencho.calculateOvertime(2));
            }
        }
    }
}
