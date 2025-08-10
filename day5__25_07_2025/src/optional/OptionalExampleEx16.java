package optional;

import java.util.Optional;

public class OptionalExampleEx16 {
	public static void main(String[] args) {
        Optional<Integer> value = Optional.ofNullable(10);
        value.ifPresent(v -> System.out.println("Value: " + v));
        System.out.println("OrElse: " + value.orElse(100));
    }
}
