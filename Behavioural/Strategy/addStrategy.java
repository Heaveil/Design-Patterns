public class addStrategy implements Strategy{
    @Override
    public void calculate(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}