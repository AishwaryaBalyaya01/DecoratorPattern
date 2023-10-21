public class CaramelAddOn extends AddOnDecorator{
    Beverage beverage;

    public CaramelAddOn(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {

        return beverage.cost() + 3;
    }

    @Override
    public String getDescription() {
        return "Caramel is added to " +beverage.getDescription()+" & total cost is: "+cost();
    }
}
