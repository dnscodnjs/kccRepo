package kosa.Restaurant;

public class MainCourse extends MenuItem {
    private boolean vegetarian;
    private boolean glutenFree;

    public MainCourse(String name, double price, String description, boolean vegetarian, boolean glutenFree) {
        super(name, price, description);
        this.vegetarian = vegetarian;
        this.glutenFree = glutenFree;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    @Override
    public String toString() {
        return super.toString() + (vegetarian ? " 채식주의자" : "") + (glutenFree ? " 밀가루 프리" : "");
    }
}
