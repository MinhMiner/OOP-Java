public class Car extends Vehicle {
    private int numberOfDoors;
    
    /** Create a new Car object. */
    public Car(String brand, String model, String registrationNumber, Person owner, 
    int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /** Get info of this car. */
    public String getInfo() {
        StringBuilder result = new StringBuilder("\nCar:\n");
        result.append("\tBrand: " + brand + "\n");
        result.append("\tModel: " + model + "\n");
        result.append("\tRegistration Number: " + registrationNumber + "\n");
        result.append("\tNumber of Doors: " + numberOfDoors + "\n");
        result.append("\tBelongs to " + owner.getName() + " - " + owner.getAddress());
        return result.toString();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
