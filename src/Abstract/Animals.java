package Abstract;

public abstract class Animals {
    private final String name;

    Animals(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    String getName() {
        return name;
    }
}
