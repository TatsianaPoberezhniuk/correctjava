
import org.junit.*;
import vehicles.ChevroletCar;
import vehicles.Driving;
import vehicles.KenworthCar;
import vehiclespark.VehicleComparator;
import vehiclespark.VehiclesPark;


import java.util.*;

public class Testing {


    public Testing() {
    }

    @Test

    public void CountingVehiclesPark() {

        VehiclesPark vehiclesPark = new VehiclesPark("VIP");
        List<Driving> vehicles = new ArrayList<Driving>();
        vehicles.add(new ChevroletCar());
        vehicles.add(new KenworthCar());
        vehicles.add(new ChevroletCar());
        vehicles.add(new KenworthCar());
        vehiclesPark.setVehicles(vehicles);


        System.out.println("Total Price:" + vehiclesPark.getTotalalPrice());

        Collections.sort(vehicles, new VehicleComparator());

        System.out.println("By Fuel Consumption");
        for (Driving v : vehicles) {
            System.out.println(v.getFuelConsumption());
        }
    }
}









