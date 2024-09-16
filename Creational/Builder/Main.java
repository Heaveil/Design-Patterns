public class Main{
    public static void main(String[] args) {
        Director director = new Director();
        // Lets build a car
        CarBuilder buildCar = new CarBuilder();
        director.setBuilder(buildCar);
        director.makeVehicle();
        Car c = buildCar.getCar();

        System.out.println("c.getName() returns : " + c.getName());
        System.out.println("c.getplateNumber() returns : " + c.getPlateNumber());

        MotorBuilder buildMotor = new MotorBuilder();
        director.setBuilder(buildMotor);
        director.makeVehicle();
        Motor m = buildMotor.getMotor();

        System.out.println("m.getName() returns : " + m.getName());
        System.out.println("m.getplateNumber() returns : " + m.getPlateNumber());
    }
}