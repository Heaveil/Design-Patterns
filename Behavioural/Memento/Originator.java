public class Originator {
    
    private String input;

    public void set(String input){
        this.input = input;
    }

    public Memento storeInMemento(){
        return new Memento(input);
    }

    public String restoreFromMemento(Memento memento){
        return memento.getInput();
    }

}
