package vehicles;


public class ChevroletCar extends PassengerCar{

    private String name = "ChevroletTahoe";


    public ChevroletCar(Integer price, Integer fuelConsumption) {
                super(price, fuelConsumption);
    }

    public ChevroletCar() {
        super(50000, 6);
    }

    @Override
    public String toString() {
        return "ChevroletCar{" +
                "name='" + name + '\'' +
                '}' + "price=" + super.getPrice()
                + "fuelConcumption=" + super.getFuelConsumption();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChevroletCar chevroletCar = (ChevroletCar) o;
        return ! (name != null ? !name.equals(chevroletCar.name) : chevroletCar.name != null);
        //Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public Integer getPrice() {
        return super.getPrice();
    }
}
