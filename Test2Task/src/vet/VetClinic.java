package vet;

import java.util.ArrayList;
import java.util.HashSet;

public class VetClinic {
    String name;
    String address;
    int capital;
    ArrayList<String> checks = new ArrayList<>();
    HashSet<Doctors> doctors = new HashSet<Doctors>();
    HashSet<Rooms> rooms = new HashSet<Rooms>();

    VetClinic() {};

     VetClinic(String name, int capital) {
         if (name != null && !(name.equals(""))) {
             this.name = name;
         }
         if (capital > 0) {
             this.capital = capital;
         }
    }
}
