public class Car implements Vehicle{
    private String name;
    private int plateNumber;

    public Car (String name, int plateNumber){
        this.name = name;
        this.plateNumber = plateNumber;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getplateNumber(){
        return plateNumber;
    }
}