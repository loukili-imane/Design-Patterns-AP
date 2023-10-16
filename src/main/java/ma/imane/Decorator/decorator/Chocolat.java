package ma.imane.Decorator.decorator;

import ma.imane.Decorator.composants.Boisson;

public class Chocolat extends Decorator{

    // on crée un chocolat pour décorer un boisson
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Au Chocolat";
    }

    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
