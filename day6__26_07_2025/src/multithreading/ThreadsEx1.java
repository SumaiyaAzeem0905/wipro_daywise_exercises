package multithreading;

public class ThreadsEx1 {
	public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try { Thread.sleep(200); } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            for (char c = 'A'; c <= 'J'; c++) {
                System.out.println(c);
                try { Thread.sleep(200); } catch (InterruptedException e) {}
            }
        });

        t1.start();
        t2.start();
    }
}
