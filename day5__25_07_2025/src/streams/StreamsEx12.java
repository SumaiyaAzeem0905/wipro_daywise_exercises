package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx12 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Raja");
        List<String> result = names.stream()
                                   .filter(s -> s.toLowerCase().contains("ja"))
                                   .collect(Collectors.toList());
        System.out.println(result);
    }
}
