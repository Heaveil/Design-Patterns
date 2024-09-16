public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder(){
        this.car = new Car();
    }

    @Override
    public void BuildName(){
        this.car.setName("This is a car");
    }

    @Override
    public void BuildPlateNumber(){
        this.car.setPlateNumber(10);
    }

    public Car getCar(){
        return car;
    }
}
