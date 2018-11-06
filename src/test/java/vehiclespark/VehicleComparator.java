package vehiclespark;


import vehicles.Driving;


import java.util.Comparator;


public class VehicleComparator implements Comparator<Driving> {

    @Override
    public int compare(Driving drivingo1, Driving drivingo2) {
        return drivingo1.getFuelConsumption() - drivingo2.getFuelConsumption();
    }
}
