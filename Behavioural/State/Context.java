public class Context {
    State state;

    public Context(){
        this.state = new StartState(this);
    }

    public void changeState(){
        state.printCurrentState();
    }

    public void setState(State state){
        this.state = state;
    }
}
