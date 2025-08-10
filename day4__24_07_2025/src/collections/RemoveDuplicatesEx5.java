package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesEx5 {
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);
    }
}
