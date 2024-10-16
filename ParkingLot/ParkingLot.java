package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
   private static ParkingLot instance;
   private List<ParkingFloor> parkingFloors;
   private final int floors;

   private ParkingLot(int floors) {
        this.floors = floors; 
        this.parkingFloors = new ArrayList<ParkingFloor>(floors);
   }

   public synchronized static ParkingLot getInstance(int floors){
     if(instance == null) {
        instance = new ParkingLot(floors);
     }
     return instance;
   }

   public synchronized void addFloor(int carSpots, int bikeSpots, int truckSpots){
    if(parkingFloors.size() == this.floors) System.out.println("No more floors can be added");
    else parkingFloors.add(new ParkingFloor(carSpots, bikeSpots, truckSpots));
   }

   public synchronized boolean parkVehicle(Vehicle vehicle){
      for(ParkingFloor parkingFloor : parkingFloors){
           return parkingFloor.parkVehicle(vehicle);
      }
      return false;
   }
   
   public synchronized boolean unparkVehicle(Vehicle vehicle){
      for(ParkingFloor parkingFloor : parkingFloors){
          return parkingFloor.unparkVehicle(vehicle);
      }
      return false;
    }

}
