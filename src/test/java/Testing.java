
import org.junit.Test;
import vehicles.ChevroletCar;
import vehicles.Driving;
import vehicles.KenworthCar;
import vehiclespark.VehiclesPark;

import java.util.List;

import java.util.ArrayList;

public class Testing {
    @Test

    public void CountingVehiclesPark() {

        VehiclesPark vehiclesPark = new VehiclesPark("VIP");
        List<Driving> vehicles = new ArrayList<Driving>();
        vehicles.add(new ChevroletCar());
        vehicles.add(new KenworthCar());

        vehiclesPark.setVehicles(vehicles);
        System.out.println("Total Price:" + vehiclesPark.getTotalalPrice());
    }

}
