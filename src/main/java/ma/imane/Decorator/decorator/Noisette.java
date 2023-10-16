package ma.imane.Decorator.decorator;

import ma.imane.Decorator.composants.Boisson;

public class Noisette extends Decorator{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Au Noisette";
    }

    @Override
    public double cout() {
        return 1.8+boisson.cout();
    }
}
