package ma.imane.proxy;

public class StandardImpl1 implements Standard {
    @Override
    public void process() {
        System.out.println("Process...");
        System.out.println("StandardImpl1");
    }
}
