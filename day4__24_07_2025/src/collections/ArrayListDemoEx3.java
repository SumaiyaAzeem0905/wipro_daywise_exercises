package collections;

import java.util.ArrayList;

public class ArrayListDemoEx3 {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(2); // remove element at index 2
        list.add(60);   // add at end
        System.out.println(list);
    }

}
