package vet;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic("Health",10000);

        Doctors doc = new Doctors("Ivan",33);
        Doctors doc2 = new Doctors("Antoniya",27);
        Doctors doc3 = new Doctors("Angel",54);
        Doctors doc4 = new Doctors("Georgi",23);
        Doctors doc5 = new Doctors("Pencho",43);
        Doctors doc6 = new Doctors("Gencho",29);

        Animal cat = new Cats("Pisan", "Cat");
        Animal cat2 = new Cats("Pisan juniour", "Cat");
        Animal dog = new Dogs("Spike", "Dog");
        Animal dog2 = new Dogs("Mickey", "Dog");
        Animal rabbit = new Rabbit("Bunny", "Rabbit");
        Animal rabbit2 = new Rabbit("Bugs", "Rabbit");

        Client client = new Client("Pencho", cat, 1000);
        Client client2 = new Client("Gencho", cat2, 1000);
        Client client3 = new Client("Pesho", dog, 1000);
        Client client4 = new Client("Gosho", dog2, 1000);
        Client client5 = new Client("Ivancho", rabbit, 1000);
        Client client6 = new Client("Kirilcho", rabbit2, 1000);

        clinic.doctors.add(doc);
        clinic.doctors.add(doc2);
        clinic.doctors.add(doc3);
        clinic.doctors.add(doc4);
        clinic.doctors.add(doc5);
        clinic.doctors.add(doc6);

        client.getCheck(client.checkersArray, client);
        client2.getCheck(client2.checkersArray, client2);
        client3.getCheck(client3.checkersArray, client3);
        client4.getCheck(client4.checkersArray, client4);
        client5.getCheck(client5.checkersArray, client5);
        client6.getCheck(client6.checkersArray, client6);

        clinic.capital += client.moneyForCheck;
        clinic.capital += client2.moneyForCheck;
        clinic.capital += client3.moneyForCheck;
        clinic.capital += client4.moneyForCheck;
        clinic.capital += client5.moneyForCheck;
        clinic.capital += client6.moneyForCheck;

        clinic.checks.add(client.check);
        clinic.checks.add(client2.check);
        clinic.checks.add(client3.check);
        clinic.checks.add(client4.check);
        clinic.checks.add(client5.check);
        clinic.checks.add(client6.check);

        System.out.println("The " + clinic.name + " examinations are: ");
        System.out.println();
        clinic.checks.forEach(System.out::println);
        System.out.println();
        System.out.println("The " + clinic.name + " capital is: ");
        System.out.println(clinic.capital);

        File file = new File("Vet Clinic Examinations.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("Vet Clinic Examinations.txt", true));
            printStream.append(clinic.checks.toString());
            printStream.append(client.name);
            printStream.append(client.animal.name);
            printStream.append(client.animal.breed);
            printStream.append(client.check);

            printStream.append(client2.name);
            printStream.append(client2.animal.name);
            printStream.append(client2.animal.breed);
            printStream.append(client2.check);

            printStream.append(client3.name);
            printStream.append(client3.animal.name);
            printStream.append(client3.animal.breed);
            printStream.append(client3.check);

            printStream.append(client3.name);
            printStream.append(client3.animal.name);
            printStream.append(client3.animal.breed);
            printStream.append(client3.check);

            printStream.append(client3.name);
            printStream.append(client3.animal.name);
            printStream.append(client3.animal.breed);
            printStream.append(client3.check);

            printStream.append(client3.name);
            printStream.append(client3.animal.name);
            printStream.append(client3.animal.breed);
            printStream.append(client3.check);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
