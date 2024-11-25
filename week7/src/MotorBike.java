public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /** Create a new MotorBike object. */
    public MotorBike(String brand, String model, String registrationNumber, Person owner,
    boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }
    
    /** Get info of this motorbike. */
    public String getInfo() {
        StringBuilder result = new StringBuilder("\nMotor Bike:\n");
        result.append("\tBrand: " + brand + "\n");
        result.append("\tModel: " + model + "\n");
        result.append("\tRegistration Number: " + registrationNumber + "\n");
        result.append("\tHas Side Car: " + hasSidecar + "\n");
        result.append("\tBelongs to " + owner.getName() + " - " + owner.getAddress());
        return result.toString();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
