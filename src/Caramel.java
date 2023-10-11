public class Caramel extends CondimentDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.60;
    }
}