package ParkingLot;

import ParkingLot.Enums.VehicleType;
import ParkingLot.LookupStrategy.RandomSpotLookupStrategy;
import ParkingLot.Payment.CashPayment;
import ParkingLot.Payment.UPIPayment;
import ParkingLot.PricingStrategy.FixedPricingStrategy;
import ParkingLot.SpotManagers.ParkingSpotManager;
import ParkingLot.SpotManagers.TwoWheelerSpotManager;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<VehicleType, ParkingSpotManager> firstLevelManager = new HashMap<>();
        firstLevelManager.put(VehicleType.TWO_WHEELER,new TwoWheelerSpotManager(Arrays.asList(new ParkingSpot("L1-S1"),new ParkingSpot("L1-S2")),new RandomSpotLookupStrategy()));
        firstLevelManager.put(VehicleType.FOUR_WHEELER,new TwoWheelerSpotManager(Arrays.asList(new ParkingSpot("L1-S3"),new ParkingSpot("L1-S4")),new RandomSpotLookupStrategy()));

        ParkingBuilding parkingBuilding = new ParkingBuilding(Arrays.asList(new ParkingLevel(1,firstLevelManager)));
        Vehicle twoWheeler = new Vehicle("Two_Wheeler_1",VehicleType.TWO_WHEELER);
        Vehicle twoWheeler2 = new Vehicle("Two_Wheeler_2",VehicleType.TWO_WHEELER);
        Vehicle fourWheeler = new Vehicle("Four_Wheeler_1",VehicleType.FOUR_WHEELER);
        Vehicle fourWheeler2 = new Vehicle("Four_Wheeler_2",VehicleType.FOUR_WHEELER);

        MainParkingLot parkingLot = new MainParkingLot(parkingBuilding,new EntranceGate(),new ExitGate(new CostComputation(new FixedPricingStrategy())));
        Ticket t1= parkingLot.vehicleArrives(twoWheeler);
        parkingLot.vehicleExits(t1, new CashPayment());
        Ticket t2= parkingLot.vehicleArrives(twoWheeler2);
        Ticket t3 = parkingLot.vehicleArrives(fourWheeler2);
        Ticket t4 = parkingLot.vehicleArrives(fourWheeler);
        parkingLot.vehicleExits(t4, new UPIPayment());
        parkingLot.vehicleExits(t3, new UPIPayment());
        parkingLot.vehicleExits(t2, new UPIPayment());
    }
}
