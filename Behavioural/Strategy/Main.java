public class Main{
    public static void main (String[] args){
        Strategy addition = new addStrategy();
        Strategy subtraction = new subtractStrategy();
        Context a = new Context(addition);
        a.calculate(5, 5);
        a.setStrategy(subtraction);
        a.calculate(5, 5);
    }
}