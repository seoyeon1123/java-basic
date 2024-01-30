package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder("두부",2000,2);
        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder("김치",5000,1);
        productOrders[1] = order2;

        ProductOrder order3 = new ProductOrder("콜라",1500,2);
        productOrders[2] = order3;

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName + " 가격 : " + productOrder.price + " 수량 : " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 주문 금액 : " + totalPrice);


    }

}
