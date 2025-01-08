package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        VehicleRegister register = new VehicleRegister();

        register.add(reg1, "Arto");
        register.add(reg2, "Jürgen");
        register.add(reg3, "Jürgen");

        register.printRegistrationPlates();
        register.printOwners();
    }
}