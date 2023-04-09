package Abstract;

public class Dogs extends Animals {
    public Dogs(String name, int legs) {
        super(name);
        this.legs = legs;
    }

    public Dogs(String name) {
        super(name);
        legs = 4;
    }

    private final int legs;

    int getLegs() {
        return legs;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
