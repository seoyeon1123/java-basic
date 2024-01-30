package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;
    private int totalPrice = 0;

    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public int getTotalPrice(){
        return price * quantity;
    }
}
