package solid.ocp;


// OCP non respecté
public class PaymentProcessor {

    public void processPayment(String type,double amount){
         if("creditCard".equals(type)){
             System.out.println("Paid Amount "+ amount+ " using credit Card");
         }
        else if("Paypal".equals(type)){
            System.out.println("Paid Amount "+ amount+ " using credit Card");
        }
    }
}
