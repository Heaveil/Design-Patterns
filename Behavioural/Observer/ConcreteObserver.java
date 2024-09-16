public class ConcreteObserver implements Observer{

    private Subject concreteSubject;


    public ConcreteObserver (Subject concreteSubject){
        this.concreteSubject = concreteSubject;
        // concreteSubject.register(this); -> this is to instantly adding a new ConcreteObserver to its Concrete Subject
    }

    @Override
    public void update() {
        System.out.println(this.toString() + " is registered to " + concreteSubject.toString());
    }
}
