import java.util.Arrays;

public class Building {
    private final String address;
    private final Apartment[] apartments;
    private int apartmentCount;

    // Constructor
    public Building(String address, int numberApartments) {
        this.address = address;
        apartmentCount = 0;
        this.apartments = new Apartment[numberApartments];
    }
    // Getter
    public String getAddress() {
        return address;
    }
    // Method to add new apartment in building
    public void addApartment(int number, int numOfRooms){
        if (this.apartmentCount < this.apartments.length){  // Check if it's empty
            Apartment newApartment = new Apartment(number, numOfRooms); // Create a new apartment
            this.apartments[apartmentCount] = newApartment;
            this.apartmentCount ++;
            System.out.println("Add new apartment successful✅");
        }else{
            System.out.println("The building doesn't have space!❌");
        }
    }

    // Method to find apartment with apartment number
    public void findApartment(int apartmenNumber){
        if (this.apartmentCount != 0){
            for (Apartment find : this.apartments){
                if (find.number() == apartmenNumber){
                    System.out.println(toString() + find);
                    break;
                }

            }
        }else{
            System.out.println("The building doesn't have apartments yet!");
        }
    }

    // Show Building Array complete.
    public void displayApartments(){
        if (this.apartmentCount != 0) {
            for (Apartment items : this.apartments) {
                System.out.println(toString() + items);
            }
        }else{
            System.out.println("The building doesn't have apartments yet!");
        }
    }

    @Override
    public String toString() {
        return String.format("Address: %s", getAddress());
    }
}
