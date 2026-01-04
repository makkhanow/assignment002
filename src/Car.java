public class Car extends Vehicle implements Servicable {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05;
    }

    @Override
    public void performService() {
        System.out.println("Car ID " + id + " is serviced. Oil changed.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + numberOfDoors;
    }
}
