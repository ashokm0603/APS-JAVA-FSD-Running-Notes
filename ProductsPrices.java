import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsPrices {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(504, 10000, 52101, 2411, 562, 412, 711, 85121, 8512, 2015,100);
        System.out.println(" Product Prices : " + prices);

        List filteredPrices = prices.stream().filter(cost -> cost > 1000).collect(Collectors.toList());

        System.out.println("Filtered Prices : " + filteredPrices);

        List fPrices = prices.stream().filter(x -> x > 1000 && x < 50000).collect(Collectors.toList());
        System.out.println(fPrices);


      List  addedValue=prices.stream().map(x->x+100).collect(Collectors.toList());

      System.out.println(addedValue);


      List discountedPrices=prices.stream().map(x->x-(x/100)*5).collect(Collectors.toList());

      System.out.println(  "After Applying 5% Discount " +discountedPrices);


     Object totalPrice= discountedPrices.stream().reduce(0,(a,b)->(int)a+(int)b);
     System.out.println(totalPrice);
    }
}
