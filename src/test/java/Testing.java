
import org.junit.Test;
import vehicles.ChevroletCar;
import vehicles.Driving;
//import vehicles.IntegerComparator;
import vehicles.KenworthCar;
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

        vehiclesPark.setVehicles(vehicles);

        //Collections.sort(driving, new IntegerComparator());
        //System.out.println("Sorted");
        //printList(vehicles);


        System.out.println("Total Price:" + vehiclesPark.getTotalalPrice());


        //public void CountingFuelConsumption() {

    }
}
        //Collections.sort(vehicles, new IntegerComparator());
    //System.out.println("Sorted");
    //printVehicles(vehicles);








