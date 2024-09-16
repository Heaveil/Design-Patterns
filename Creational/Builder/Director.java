public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void makeVehicle(){
        this.builder.BuildName();
        this.builder.BuildPlateNumber();
    }  
}
