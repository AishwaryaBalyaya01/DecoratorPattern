public class CaramelAddOn extends AddOnDecorator{
    Beverage beverage;

    public CaramelAddOn(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        int cost = beverage.cost() + 3;
        return cost;
    }

    @Override
    public String getDescription() {
        return "Caramel, " +beverage.getDescription();
    }
}
