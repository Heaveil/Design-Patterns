import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       for (Observer observer : observers){
            observer.update();
       }
    }    
}
