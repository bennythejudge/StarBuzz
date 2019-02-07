package android.benedetto.com.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    // drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "Steamed milk + coffee", R.drawable.latte),
            new Drink("Cappuccino", "Steamed frothy milk + coffee", R.drawable.cappuccino),
            new Drink("Americano", "Filtered black coffee", R.drawable.americano),
            new Drink("Mochaccino", "Cappuccino + liquid chocolate", R.drawable.mochaccino)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResouceId() {
        return this.imageResourceId;
    }

    // the string representation of a Drink is its name
    public String toString() {
        return this.name;
    }
}
