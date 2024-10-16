package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(int carSpots, int bikeSpots, int truckSpots){
        this.parkingSpots = new ArrayList<ParkingSpot>();
        for(int i  = 0; i< carSpots; i++){
            this.parkingSpots.add(new ParkingSpot(VehicleType.CAR));
        }

        for(int i  = 0; i< bikeSpots; i++){
            this.parkingSpots.add(new ParkingSpot(VehicleType.MOTORCYCLE));
        }

        for(int i  = 0; i< truckSpots; i++){
            this.parkingSpots.add(new ParkingSpot(VehicleType.TRUCK));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(parkingSpot.isSpotAvailable() && parkingSpot.getVehicleType() == vehicle.getVehicleType()) {
                System.out.println("Call comes here");
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot: parkingSpots){
          if(!parkingSpot.isSpotAvailable() && parkingSpot.getParVehicle() == vehicle){
            parkingSpot.unparkVehicle(vehicle);
            return true;
          }
        }
        return false;
    }
}
