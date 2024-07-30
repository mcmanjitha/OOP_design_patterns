import ducktypes.MallardDuck;
import ducktypes.Duck;

public class DuckGame {
    public static void main(String[] args){

        Duck md1 = new MallardDuck();
        md1.display();
        md1.performFly();
        md1.performQuak();
    }
}
