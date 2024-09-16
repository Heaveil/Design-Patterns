public class StopSate implements State {

    private Context context;

    public StopSate (Context context){
        this.context = context;
    }
    
    @Override
    public void printCurrentState() {
        System.out.println("STOP!");
        context.setState(new StartState(context));
    }

}
