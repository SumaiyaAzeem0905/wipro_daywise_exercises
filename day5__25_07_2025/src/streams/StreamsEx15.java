package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsEx15 {
	public static void main(String[] args) {
        List<FoodItem> foods = Arrays.asList(
            new FoodItem("Noodles", "Veg", "Chinese", 200),
            new FoodItem("Manchurian", "Veg", "Chinese", 250)
        );
        foods.stream()
             .filter(f -> f.cuisine.equalsIgnoreCase("Chinese"))
             .max((f1, f2) -> Double.compare(f1.price, f2.price))
             .ifPresent(System.out::println);
    }
}
