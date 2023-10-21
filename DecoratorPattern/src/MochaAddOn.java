public class MochaAddOn extends AddOnDecorator{
    Beverage beverage;
    public MochaAddOn(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return "Mocha is added to "+beverage.getDescription()+" & total cost is: "+cost();
    }
}
