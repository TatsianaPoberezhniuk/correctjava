package vehicles;

import java.util.Objects;

public class KenworthCar extends TruckCar {

    private String name = "Kenworth W900";

    public KenworthCar(Integer price, Integer fuelConsumption, String name) {
        super(price, fuelConsumption);
    }

    public KenworthCar() {
        super(100000, 50);
    }


    @Override
    public String toString() {
        return "KenworthCar{" +
                "name='" + name + '\'' +
                '}' + "price=" + super.getPrice()
                + "fuelConcumption=" + getFuelConsumption();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KenworthCar kenworthCar = (KenworthCar) o;
        return !(name != null ? !name.equals(kenworthCar.name) : kenworthCar.name != null);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public Integer getPrice() {
        return super.getPrice();

    }
}

