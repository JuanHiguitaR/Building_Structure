public record Apartment(int number, int numberOfRooms) {

    @Override
    public String toString() {
        return String.format("Apartment Number: %s  with Rooms Number: %s",
                number(), numberOfRooms());
    }
}
