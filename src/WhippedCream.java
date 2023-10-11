public class WhippedCream extends CondimentDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.75;
    }
}
