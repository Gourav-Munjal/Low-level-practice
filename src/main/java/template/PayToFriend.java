package template;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate Request");
    }

    @Override
    public void calculateFee() {
        System.out.println("0 % fee");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit to receiver");
    }
}
