public class Espresso extends Beverage{
    public Espresso(){
        description="Espresso";
        getDescription();
    }
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String getDescription(){
        return description;
    }

}
