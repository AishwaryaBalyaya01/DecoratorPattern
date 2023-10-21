import java.util.Arrays;
import java.util.List;

public class PrettyDecorator extends AddOnDecorator{
    Beverage beverage;
    public PrettyDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return beverage.cost();
    }

    @Override
    public String getDescription() {
        String[] array = beverage.getDescription().split(",");
        Arrays.sort(array);
        int count=0;
        StringBuilder finalDescription = new StringBuilder();
        for(int i =0;i<array.length;i++){
            count=1;
               if(i+1< array.length-1 && array[i].equals(array[i+1])) {
                   count++;
                   i++;
               }
            finalDescription.append(count+array[i]+" ");
        }
        return finalDescription.toString();
    }
}
