package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        payService.processPay("kakao", 50000);
    }
}
