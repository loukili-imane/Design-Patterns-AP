package ma.imane.observer;

public class ObserverImpl2 implements Observer {
    private int counter;

    @Override
    public void update(int state) {
        if (state % 2 == 0) ++counter;
        System.out.println("ObserverImpl2 ...");
        System.out.println("Updated state = " + state);
        System.out.println("Result : " + ((state % 2) == 0 ? "Even" : "Odd"));
        System.out.println("Counter : " + counter);
    }
}
