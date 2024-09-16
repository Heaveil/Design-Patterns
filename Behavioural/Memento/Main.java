public class Main{
    public static void main (String[] args){
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        String a = "This is the first input";
        originator.set(a);
        caretaker.addMemnto(originator.storeInMemento());

        a = "This is the second input";
        originator.set(a);
        caretaker.addMemnto(originator.storeInMemento());

        a = "This is the third input";
        originator.set(a);
        caretaker.addMemnto(originator.storeInMemento());

        String first_restored= originator.restoreFromMemento(caretaker.getMemento());
        String second_restored= originator.restoreFromMemento(caretaker.getMemento());
        String third_restored= originator.restoreFromMemento(caretaker.getMemento());

        System.out.println(first_restored);
        System.out.println(second_restored);
        System.out.println(third_restored);
    }
}