public class Main{
    public static void main (String[] args){
        Facade facade = new Facade();

        facade.show();
        System.out.println("-------------------");
        facade.show(1);
        System.out.println("-------------------");
        facade.show(2);
    }
}