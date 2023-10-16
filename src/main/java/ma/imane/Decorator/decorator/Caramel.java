package ma.imane.Decorator.decorator;

import ma.imane.Decorator.composants.Boisson;

public class Caramel extends Decorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Au Caramel";
    }

    @Override
    public double cout() {
        return 0.8+boisson.cout();
    }
}
