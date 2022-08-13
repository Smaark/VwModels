public abstract class Volkswagen implements Car {

    @Override
    public String getFactory() {
        return "Volkswagen";
    }

    public abstract int getTopSpeed();

    public abstract String getModelName();
}
