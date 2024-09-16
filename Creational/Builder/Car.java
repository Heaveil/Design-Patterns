public class Car {
    private String name;
    private int plateNumber;

    public Car(){};

    public void setName(String name){
        this.name = name;
    }

    public void setPlateNumber(int plateNumber){
        this.plateNumber = plateNumber;
    }

    public String getName(){
        return name;
    }

    public int getPlateNumber(){
        return plateNumber;
    }
}
