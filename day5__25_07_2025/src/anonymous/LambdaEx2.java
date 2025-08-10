package anonymous;

public class LambdaEx2 {
public static void main(String[] args) {
		
		GreetEx2 greeting = () -> System.out.println("Hello Lambda");
		
		greeting.sayHello();
		
	}
}
