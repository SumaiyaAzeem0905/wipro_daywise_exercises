package anonymous;

public class AnonymousInnEx1 {
	public static void main(String[] args) {
		BankOpsEx1 savingsAccount = new BankOpsEx1() {

			@Override
			public void deposit(double amount) {
				System.out.println("Saving " + amount);
				
			}
			
		};
		savingsAccount.deposit(10000);
		
		BankOpsEx1 currentAccount = new BankOpsEx1() {

			@Override
			public void deposit(double amount) {
				System.out.println("Current Account " + amount);
				
			}
			
		};
		currentAccount.deposit(50000);

	}
}
