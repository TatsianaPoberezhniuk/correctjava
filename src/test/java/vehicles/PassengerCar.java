package vehicles;

public class PassengerCar implements Driving {

    private Integer price;
    private Integer fuelConsumption;

    public PassengerCar(Integer price, Integer fuelConsumption) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive() {
        System.out.println("TruckCar is driven");
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
