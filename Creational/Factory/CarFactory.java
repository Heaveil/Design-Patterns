public class CarFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle(int plateNumber){
        return new Car("Car", plateNumber);
    }

}