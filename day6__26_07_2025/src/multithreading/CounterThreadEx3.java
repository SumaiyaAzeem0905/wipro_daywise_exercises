package multithreading;

public class CounterThreadEx3 {
CounterEx3 counter;
	
	public CounterThreadEx3(CounterEx3 counter) {
		this.counter = counter;
	};
	
	public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}
