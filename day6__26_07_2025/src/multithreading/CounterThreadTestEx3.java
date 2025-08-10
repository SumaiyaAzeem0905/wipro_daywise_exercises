package multithreading;

public class CounterThreadTestEx3 {
	public static void main(String[] args) {
		CounterEx3 counter = new CounterEx3(0);

		CounterThreadEx3 t1 = new CounterThreadEx3(counter);
		CounterThreadEx3 t2 = new CounterThreadEx3(counter);

        t1.start();
        t2.start();

        t1.join();
		t2.join();

        System.out.println("Final output " + counter.getCount());
	}

}
