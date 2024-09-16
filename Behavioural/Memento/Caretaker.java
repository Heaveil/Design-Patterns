import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> savedMementos = new ArrayList<>();

    public void addMemnto(Memento memento){
        savedMementos.add(memento);
    }

    public Memento getMemento(){
        return pop(savedMementos);
    }

    public static Memento pop(ArrayList <Memento> savedMementos){
        Memento a = savedMementos.get(savedMementos.size()-1);
        savedMementos.remove(a);
        return a;
    }
}
