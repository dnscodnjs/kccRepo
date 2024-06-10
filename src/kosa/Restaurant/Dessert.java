package kosa.Restaurant;

public class Dessert extends MenuItem{
    private boolean containsNuts;

    public Dessert(String name, double price, String description, boolean containsNuts) {
        super(name, price, description);
        this.containsNuts = containsNuts;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    @Override
    public String toString() {
        return super.toString() + (containsNuts ? " 땅콩 포함 " : "");
    }
}
