package week3.day3;

public class Amazon extends CanaraBank {

  @Override
    public void cashOnDelivery() {
        System.out.println("COD payment is not accepted");
        recordPaymentDetails("Cash on Delivery");
    }

    @Override
    public void upiPayments() {
        System.out.println("UPI payments is accepted");
        recordPaymentDetails("UPI Payment");
    }

    @Override
    public void cardPayments() {
        System.out.println("Card payments is accepted");
        recordPaymentDetails("Card Payment");
    }

    @Override
    public void internetBanking() {
        System.out.println("Net-Banking payments is accepted");
        recordPaymentDetails("Internet Banking");
    }

    @Override
   public  void recordPaymentDetails(String paymentType) {
        System.out.println("Recording payment details: " + paymentType);
    }
   public static void main(String[] args) {
        Amazon order = new Amazon();
        order.cashOnDelivery();
        order.cardPayments();
        order.upiPayments();
        order.internetBanking();
    }
}

	