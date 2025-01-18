package template;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("validate request for merchant");
    }

    @Override
    public void calculateFee() {
        System.out.println("2 % fee");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit amount from customer");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount to merchant");
    }
}
