package kosa.shopping;

public enum Category {
    ELECTRONICS("전자제품"),
    CLOTHES("의류"),
    FOOD("음식");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Category[] getCategories() {
        return Category.values();
    }

}
