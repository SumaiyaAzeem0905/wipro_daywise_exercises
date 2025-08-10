package day7__28_07_2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethosRefEx5 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Sumaiya", "Azeem", "Isha", "Nida");

        List<String> sortedNames = names.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
