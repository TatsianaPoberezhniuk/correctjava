package vehiclespark;

import vehicles.Driving;

import java.util.List;

public class VehiclesPark {

    private String name;
    private List<Driving> vehicles;

    public VehiclesPark(String name, List<Driving> vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public VehiclesPark(String name) {
        this.name = name;
    }

    public List<Driving> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Driving> vehicles) {
        this.vehicles = vehicles;
    }

    public Integer getTotalalPrice() {
        Integer totalPrice = 0;


        for (Driving vehicles : vehicles) {
            totalPrice = totalPrice + vehicles.getPrice();
        }
        return totalPrice;
    }
}
