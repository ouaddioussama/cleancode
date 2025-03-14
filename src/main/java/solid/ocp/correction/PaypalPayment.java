package solid.ocp.correction;

public class PaypalPayment extends Payment {

    @Override
    void pay(String type, double amount) {
        System.out.println("Paid Amount "+ amount+ " using credit Card");
    }
}
