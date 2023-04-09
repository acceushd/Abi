public class Humans extends Animals {

    public Humans(String name) {
        super(name);
        arms = 2;
    }

    public Humans(String name, int arms) {
        super(name);
        this.arms = arms;
    }

    private final int arms;

    int getArms() {
        return arms;
    }

    @Override
    public void makeSound() {
        System.out.println("Hello, World!");
    }
}
