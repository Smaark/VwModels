public abstract class Audi implements Car {
    @Override
    public String getFactory() {
        return "Audi";
    }

    public abstract int getTopSpeed();

    public abstract String getModelName();
}
