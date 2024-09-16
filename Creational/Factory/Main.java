public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle c0 = carFactory.createVehicle(0);
        Vehicle c1 = carFactory.createVehicle(1);

        System.out.println("c0.getName() returns : " + c0.getName());
        System.out.println("c1.getplateNumber() returns : " + c1.getName());
        System.out.println("c0.getName() returns : " + c0.getplateNumber());
        System.out.println("c1.getplateNumber() returns : " + c1.getplateNumber());
    }
}
