public class Main{
    public static void main (String[] args){
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver1 = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserver2 = new ConcreteObserver(concreteSubject);
        concreteSubject.notifyObservers(); // this will print nothing because there is no observer being added yet
        System.out.println("add observer1");
        concreteSubject.register(concreteObserver1);
        concreteSubject.notifyObservers();

        System.out.println("add observer2");
        concreteSubject.register(concreteObserver2);
        concreteSubject.notifyObservers();

        System.out.println("remove observer1");
        concreteSubject.unregister(concreteObserver1);
        concreteSubject.notifyObservers();

        System.out.println("add observer1");
        concreteSubject.register(concreteObserver1);
        concreteSubject.notifyObservers();
    }
}