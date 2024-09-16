public class Facade {
    Subclass1 s1;
    Subclass2 s2;

    public Facade(){
        s1 = new Subclass1();
        s2 = new Subclass2();
    }

    public void show(){
        s1.show();
        s2.show();
    }

    public void show(int s){
        if (s == 1){
            s1.show();
        }
        else if (s == 2){
            s2.show();
        }
    }
    
}
