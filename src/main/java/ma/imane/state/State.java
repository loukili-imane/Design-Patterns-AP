package ma.imane.state;

abstract class State {
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    public abstract void sortirDuGarrage();

    public abstract void entrerAuGarrage();

    public abstract void decoller();

    public abstract void atterir();

    public abstract void doActivity();
}
