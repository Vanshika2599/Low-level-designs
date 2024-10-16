package ParkingLot;

public abstract class Vehicle {
     private VehicleType vehicleType;
     private String licenseNumber;
     
     Vehicle(final VehicleType vehicleType, String licenseNumber) {
        this.licenseNumber =  licenseNumber;
        this.vehicleType = vehicleType;
     }

     public VehicleType getVehicleType(){
        return this.vehicleType;
    }
}
