package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FoodItem {
    String name, type, cuisine;
    double price;
    FoodItem(String name, String type, String cuisine, double price) {
        this.name = name; this.type = type; this.cuisine = cuisine; this.price = price;
    }
    public String toString() { return name + " - " + cuisine + " - " + price; }
}

public class StreamsEx14 {
    public static void main(String[] args) {
        List<FoodItem> foods = Arrays.asList(
            new FoodItem("Noodles", "Veg", "Chinese", 200),
            new FoodItem("Pizza", "Veg", "Italian", 300)
        );
        List<FoodItem> chineseFoods = foods.stream()
                                           .filter(f -> f.cuisine.equalsIgnoreCase("Chinese"))
                                           .collect(Collectors.toList());
        chineseFoods.forEach(System.out::println);
    }
}
