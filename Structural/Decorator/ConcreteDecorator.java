public class ConcreteDecorator extends Decorator {
    
    public ConcreteDecorator(Component component){
        super(component);
    }

    public void show(){
        super.show();
        System.out.println("The Function is called from Concrete Decorator class");
    }
}
