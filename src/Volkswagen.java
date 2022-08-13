public abstract class Volkswagen implements Car {

    @Override
    public String getFactory() {
        return "Volkswagen";
    }

    public abstract int getTopSpeed();

    public abstract String getModelName();
}

// Abstract class, egy fő class, amelyik classok ebből származnak le (extends) azok az Abstract class tulajdonságait is megöröklik