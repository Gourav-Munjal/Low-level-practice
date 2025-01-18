package template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow flow = new PayToFriend();
        flow.sendMoney();
    }
}
