package vehiclespark;

import vehicles.ChevroletCar;
import vehicles.KenworthCar;

import java.util.Comparator;

public class VehicleComparator implements Comparator{
    @Override
    public int compare(ChevroletCar o1, KenworthCar o2) {
        return 01.getFuelConsumption().compareTo(02.getFuelConsumption);
    }
}
