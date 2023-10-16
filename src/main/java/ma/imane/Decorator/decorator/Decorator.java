package ma.imane.Decorator.decorator;

import ma.imane.Decorator.composants.Boisson;

public abstract class Decorator extends Boisson{
    protected Boisson boisson;

    @Override
    public String getDescription() {
        return boisson.getDescription();
    }

    public Decorator(Boisson boisson){
        this.boisson = boisson;
    }
}
