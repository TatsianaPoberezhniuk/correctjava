package vehiclespark;

import vehicles.ChevroletCar;
import vehicles.Driving;
import vehicles.KenworthCar;

import java.util.Comparator;


public class VehicleComparator implements Comparator<Driving> {

    @Override
    public int compare(Driving drivingo1, Driving drivingo2) {
        return drivingo1.getFuelConsumption() - drivingo2.getFuelConsumption();
    }
}
