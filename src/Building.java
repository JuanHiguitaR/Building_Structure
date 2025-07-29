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

    public String getAddress() {
        return address;
    }

    public void addApartment(Apartment newApartment){
        if (this.apartmentCount < this.apartments.length){
            this.apartments[apartmentCount] = newApartment;
            this.apartmentCount ++;
            System.out.println("Add new apartment successful✅");
        }else{
            System.out.println("The building doesn't have space!❌");
        }
    }

    public void findApartment(int apartmenNumber){
        if (this.apartmentCount != 0){
            for (Apartment find : this.apartments){
                if (find.number() == apartmenNumber){
                    System.out.println(find);
                }else{
                    System.out.println("Sorry, we can find it!");
                }
            }
        }else{
            System.out.println("The building doesn't have apartments yet!");
        }
    }

    public void displayApartments(){
        if (this.apartmentCount != 0) {
            for (Apartment items : this.apartments) {
                System.out.println(items);
            }
        }else{
            System.out.println("The building doesn't have apartments yet!");
        }
    }
}
