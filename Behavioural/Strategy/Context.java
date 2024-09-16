public class Context {
    private Strategy strategy;

    public Context (Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void calculate(int a, int b){
        strategy.calculate(a, b);
    }
}
