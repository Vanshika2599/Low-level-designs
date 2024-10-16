package ParkingLot;

public class ParkingSpot {
    private VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }

    public boolean isSpotAvailable(){
        return parkedVehicle == null;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        parkedVehicle = vehicle;
    }

    public synchronized void unparkVehicle(Vehicle vehicle) {
      parkedVehicle = null;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public Vehicle getParVehicle() {
        return this.parkedVehicle;
    }
}
