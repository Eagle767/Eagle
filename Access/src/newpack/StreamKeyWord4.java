package newpack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class StreamKeyWord4 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        //Adding Products
        items.add(new Item(1,"mango",200));
        items.add(new Item(2,"apple",300));
        items.add(new Item(3,"pineapple",180));
        items.add(new Item(4,"jack",350));
        items.add(new Item(5,"grapes",60));
        List<Float> itempricelist = new ArrayList<Float>();
        for(Item product: items){
            // filtering data of list
            if(product.price<200){
                itempricelist.add(product.price);    // adding price to a itempricelist
            }
        }
        System.out.println(itempricelist);
        // Filtering collections using stream
        List<Float> itempricelist2 =items.stream()
                .filter(i -> i.price <= 200)// filtering data
                .limit(2)
                .map(i->i.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(itempricelist2);
        	
      	itempricelist2.stream().forEach(System.out::print);
        // optimized 	
      	items.stream()
        .filter(item -> item.price <= 200)
        .forEach(item -> System.out.println(item.name));
      	
        // accumulating price, / by referring method of Float class
      	 Float totalPrice = items.stream()
                 .map(item->item.price)
                 .reduce(0.0f,(sum, price)->sum+price);
      	 		 //.reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
      	 	System.out.println(totalPrice);
      	 	
      	// addting items 	
      	 	double totalPrice3 = items.stream()
                    .collect(Collectors.summingDouble(product->product.price));
      	 	System.out.println(totalPrice3);
      	// max() method to get max Product price   and for minimum use same max with contra condition
      	 	Item itema = items.stream().max((item1, item2)->
            item1.price > item2.price ? 1: -1).get();
            System.out.println(itema.price);
         // count number of products based on the filter
            long count = items.stream().filter(item->item.price<200).count();
            System.out.println(count);
         // Converting product List into Set
            Set<Float> itemPriceList =
                items.stream()
                .filter(item->item.price < 200)   // filter product on the base of price
                .map(item->item.price)
                .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
            System.out.println(itemPriceList);
         // Converting Item List into a Map
            Map<Integer,String> itemspricemap =
                items.stream().collect(Collectors.toMap(i->i.id, i->i.name));
            System.out.println(itemspricemap);
         //Method reference in stream
            List<Float> itemPriceList1 =
                    items.stream()
                                .filter(i -> i.price > 200) // filtering data
                                .map(Item::getPrice)         // fetching price by referring getPrice method
                                .collect(Collectors.toList());  // collecting as list
            System.out.println(itemPriceList1);
    }
}