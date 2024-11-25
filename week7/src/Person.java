import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /** Create a new Person object. */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<>();
    }

    /** Add a vehicle. */
    public void addVehicle(Vehicle vehicle) {
        Iterator<Vehicle> i = vehicleList.iterator();
        while (i.hasNext()) {
            Vehicle v = i.next();
            if (v.equals(vehicle)) {
                return;
            }
        }
        vehicleList.add(vehicle);
    }

    /** Remove a vehicle with registration number. */
    public void removeVehicle(String registrationNumber) {
        Iterator<Vehicle> i = vehicleList.iterator();
        while (i.hasNext()) {
            Vehicle v = i.next();
            if (v.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(v);
                break;
            }
        }
    }

    /** Get vehicles info. */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return name + " has no vehicle!";
        } else {
            StringBuilder result = new StringBuilder(name + " has:\n");
            for (Vehicle v : vehicleList) {
                result.append(v.getInfo());
            }
            return result.toString();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
