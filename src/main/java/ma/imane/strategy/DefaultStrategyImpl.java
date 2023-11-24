package ma.imane.strategy;

public class DefaultStrategyImpl implements Strategy{
    @Override
    public void operation() {
        System.out.println("DefaultStrategy");
    }
}
