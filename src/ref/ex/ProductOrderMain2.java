package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = creatOrder("두부", 2000, 2);
        orders[1] = creatOrder("김치", 5000, 1);
        orders[2] = creatOrder("콜라", 1500, 2);

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액:" + totalAmount);
    }

    public static ProductOrder creatOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrder(ProductOrder[] order) {
        for (int i = 0; i < order.length; i++) {
            System.out.println("상품명 : " + order[i].productName + "가격 : " + order[i].price + "수량 : " + order[i].quantity);
        }
    }


    public static int getTotalAmount(ProductOrder[] order) {
        int totalAmount = 0;
        for (int i = 0; i < order.length; i++) {
            totalAmount += order[i].price * order[i].quantity;

        }return totalAmount;
    }
}
