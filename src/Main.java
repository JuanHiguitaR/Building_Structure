//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a Building
        Building terranova = new Building("3 north trenton", 6);
        terranova.displayApartments(); // Check Empty Array

        // add new apartments
        terranova.addApartment(101, 4);
        terranova.addApartment(102, 2);
        terranova.addApartment(103, 3);
        terranova.addApartment(201, 1);
        terranova.addApartment(202, 5);
        terranova.addApartment(203, 2);
        terranova.addApartment(301, 4); // Overflow apartments array

        // Show building info
        terranova.displayApartments();

        // find building apartment
        terranova.findApartment(201);



    }
}