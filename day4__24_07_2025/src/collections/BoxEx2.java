package collections;

public class BoxEx2 <T> {
	    private T value;

	    public void add(T value) {
	        this.value = value;
	    }

	    public T get() {
	        return value;
	    }

	    public static void main(String[] args) {
	        BoxEx2<String> b = new BoxEx2<>();
	        b.add("Hello");
	        System.out.println(b.get());
	    }
}
