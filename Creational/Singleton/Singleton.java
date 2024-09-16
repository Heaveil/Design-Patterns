public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton(String data){
        this.data = data;
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton("There can be only one ");
        }
        return instance;
    }

    public String getData(){
        return data +this.toString();
    }
}
