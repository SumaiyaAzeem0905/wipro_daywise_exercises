package solid;

public class PaymentProcessorEx6 {
	Paymentex6 paymentMethod;

    public PaymentProcessorEx6(Paymentex6 paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        paymentMethod.pay(amount);
    }
}
