public class Main{
    public static void main (String[] agrs){
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1.getData());
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.getData());
    }
}