public class MotorBuilder implements Builder{
    private Motor motor;

    public MotorBuilder(){
        this.motor = new Motor();
    }

    @Override
    public void BuildName(){
        this.motor.setName("This is a Motor");
    }

    @Override
    public void BuildPlateNumber(){
        this.motor.setPlateNumber(11);
    }

    public Motor getMotor(){
        return motor;
    }
}
