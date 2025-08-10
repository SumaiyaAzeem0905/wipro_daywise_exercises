package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsEx13 {
public static void main(String[] args) {
		
		List<Integer> numlist = Arrays.asList(2,4,6,8,10);
		
		double avg = numlist.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);

        System.out.println(avg);
	}
}
