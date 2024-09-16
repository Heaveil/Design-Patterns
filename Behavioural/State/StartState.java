public class StartState implements State {

    private Context context;

    public StartState(Context context){
        this.context = context;
    }

    @Override
    public void printCurrentState() {
        System.out.println("START!");
        context.setState(new StopSate(context));        
    }

}
