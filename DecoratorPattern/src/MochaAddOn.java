public class MochaAddOn extends AddOnDecorator{
    Beverage beverage;
    public MochaAddOn(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        int cost = beverage.cost() + 5;
        return cost;
    }

    @Override
    public String getDescription() {
        return "Mocha, "+beverage.getDescription();
    }
}
