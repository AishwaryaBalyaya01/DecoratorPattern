// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Beverage beverage2 = new Espresso();
        beverage2 = new MochaAddOn(beverage2);
        beverage2 = new MochaAddOn(beverage2);
        beverage2 = new CaramelAddOn(beverage2);
        beverage2 = new PrettyDecorator(beverage2);
        System.out.println(beverage2.getDescription()
                + "Total cost: $" + beverage2.cost());
    }
}